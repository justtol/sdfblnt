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
    private String type;

    /**
     * регион
     */
    @Column( name = "REGION_CODE" )
    private String regionCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "REGION_CODE", insertable = false, updatable = false )
    private Region region;

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public String getRegionCode()
    {
        return regionCode;
    }

    public void setRegionCode( String regionCode )
    {
        this.regionCode = regionCode;
    }

    public Region getRegion()
    {
        return region;
    }

    public void setRegion( Region region )
    {
        this.region = region;
    }
}