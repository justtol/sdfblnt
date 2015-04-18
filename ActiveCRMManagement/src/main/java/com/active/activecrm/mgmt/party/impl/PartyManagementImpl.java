package com.active.activecrm.mgmt.party.impl;

import com.active.activecrm.data.dao.party.PartyDAO;
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

    public Long createParty( Party party  )
    {
        return partyDAO.create( party );
    }

    public Party getParty( Long id )
    {
        return partyDAO.findById( id );
    }
}