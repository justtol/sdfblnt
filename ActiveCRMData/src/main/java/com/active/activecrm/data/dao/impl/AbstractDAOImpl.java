package com.active.activecrm.data.dao.impl;

import com.active.activecrm.data.dao.AbstractDAO;
import com.active.activecrm.data.entities.BaseEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class AbstractDAOImpl<Entity extends BaseEntity> implements AbstractDAO<Entity>
{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Long create( Entity entity )
    {
        em.persist( entity );
        return entity.getId();
    }

    @Override
    public Entity findById( Long id )
    {
        List<Entity> list = em.createQuery( "select e from " + getEntityClass().getName() + " e where e.id = :id" )
                .setParameter( "id", id )
                .getResultList();
        if( list.size() > 0  )
        {
            return list.get( 0 );
        }
        else
        {
            return null;
        }
    }

    public abstract Class getEntityClass();

}
