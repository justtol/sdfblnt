package com.active.activecrm.data.dao;

import com.active.activecrm.data.entities.BaseEntity;

public interface AbstractDAO< Entity extends BaseEntity >
{
    Long create( Entity entity );

    Entity findById( Long id );
}
