package com.active.activecrm.data.entities.dicts;

import javax.persistence.*;
import java.io.Serializable;

/**
 * справочник городов
 */
@Entity
@Table( name = "CITY" )
public class City extends BaseDictionary implements Serializable
{

    /**
     * тип населенного пункта
     */
    @Column( name = "CITY_TYPE" )
    public String type;

    /**
     * регион
     */
    @Column( name = "REGION_CODE" )
    public String regionCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "REGION_CODE", insertable = false, updatable = false )
    private Region region;


}