package com.active.activecrm.mgmt.dicts.impl;

import com.active.activecrm.data.PagedData;
import com.active.activecrm.data.dao.dicts.CityRepository;
import com.active.activecrm.data.entities.dicts.City;
import com.active.activecrm.data.entities.party.Party;
import com.active.activecrm.mgmt.dicts.DictsManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Transactional( propagation = Propagation.REQUIRED )
public class DictsManagementImpl implements DictsManagement
{
    @Autowired
    private CityRepository cityRepository;

    @Override
    public PagedData<City> searchCities( String key, Integer offset, Integer limit )
    {
        List< City > cities = new ArrayList<>(  );
        if( key == null )
        {
            return new PagedData<>( 0, cities );
        }
        Integer count = cityRepository.findCountByName( "%" + key.trim().toLowerCase() + "%" );

        if( count > 0 )
        {
            cities = cityRepository.findByName( "%" + key.trim().toLowerCase() + "%", new PageRequest( offset, limit ) );
        }
        return new PagedData<>( count, cities );
    }

}
