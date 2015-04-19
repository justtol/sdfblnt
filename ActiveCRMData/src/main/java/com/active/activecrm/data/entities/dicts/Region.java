package com.active.activecrm.data.entities.dicts;

import javax.persistence.*;
import java.io.Serializable;

/**
 * справочник регионов
 */
@Entity
@Table( name = "REGION" )
public class Region extends BaseDictionary implements Serializable
{
    /**
     * тайм зона
     */
    @Column( name = "TIMEZONE" )
    private String timezone;

    /**
     * Код страны
     */
    @Column( name = "COUNTRY_CODE" )
    private String countryCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "COUNTRY_CODE", insertable = false, updatable = false )
    private Country country;

    public Country getCountry()
    {
        return country;
    }

    public void setCountry( Country country )
    {
        this.country = country;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public void setTimezone( String timezone )
    {
        this.timezone = timezone;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public void setCountryCode( String countryCode )
    {
        this.countryCode = countryCode;
    }
}