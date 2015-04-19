package com.active.activecrm.data.entities.dicts;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * справочник городов
 */
@Entity
@Table( name = "REGION" )
public class City extends BaseDictionary implements Serializable
{

    /**
     * тип населенного пункта
     */
    public String type;
    /**
     * регион
     */
    public String regioncode;


}