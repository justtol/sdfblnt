package com.active.activecrm.mgmt.party.impl;

import com.active.activecrm.data.PagedData;
import com.active.activecrm.data.dao.party.PartyDAO;
import com.active.activecrm.data.dao.party.PartyRepository;
import com.active.activecrm.data.entities.party.Party;
import com.active.activecrm.mgmt.party.PartyManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Transactional( propagation = Propagation.REQUIRED )
public class PartyManagementImpl implements PartyManagement
{
    @Autowired
    private PartyDAO partyDAO;

    @Autowired
    private PartyRepository partyRepository;

    public Party createParty( Party party  )
    {
        return partyRepository.save( party );
        //return partyDAO.create( party );
    }

    public Party getParty( Long id )
    {
        //return partyRepository.findOne( id );
        return partyRepository.loadPartyById( id );
        //return partyDAO.findById( id );
    }

    public PagedData<Party> searchParties( String key, Integer offset, Integer limit )
    {
        List< Party > parties = new ArrayList<>(  );
        if( key == null )
        {
            return new PagedData<>( 0, parties );
        }
        Integer count = partyRepository.findCountByNameOrTin( "%" + key.trim().toLowerCase() + "%" );

        if( count > 0 )
        {
            parties = partyRepository.findByNameOrTin( "%" + key.trim().toLowerCase() + "%", new PageRequest( offset, limit ) );
        }
        return new PagedData<>( count, parties );
    }

    public Party saveParty( Party party )
    {
        return partyRepository.save( party );
    }

}