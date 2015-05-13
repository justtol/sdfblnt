package com.active.activecrm.mgmt.party.impl;

import com.active.activecrm.data.dao.party.PartyDAO;
import com.active.activecrm.data.dao.repositories.PartyRepository;
import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.party.Party;
import com.active.activecrm.mgmt.party.PartyManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
        return partyRepository.findOne( id );
        //return partyDAO.findById( id );
    }

    public List<Party> searchParties( String key )
    {
        return partyRepository.findByNameOrTin( "%" + key.trim().toLowerCase() + "%" );
    }

}