package com.active.activecrm.data.dao.party.impl;

import com.active.activecrm.data.dao.impl.AbstractDAOImpl;
import com.active.activecrm.data.dao.party.PartyDAO;
import com.active.activecrm.data.entities.party.Party;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class PartyDAOImpl extends AbstractDAOImpl<Party> implements PartyDAO
{

    @PersistenceContext()
    private EntityManager em;

    @Override
    public Class getEntityClass()
    {
        return Party.class;
    }
}
