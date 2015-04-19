package com.active.activecrm.data.entities.party;

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.dicts.AddressType;
import com.active.activecrm.data.entities.dicts.City;
import com.active.activecrm.data.entities.dicts.Country;
import com.active.activecrm.data.entities.dicts.Region;

import javax.persistence.*;
import java.io.Serializable;

/**
 * адреса
 */
@Entity
@SequenceGenerator(name="partyAddressSeq", sequenceName="PARTY_ADDRESS_SEQ")
@Table( name = "PARTY_ADDRESS" )
public class PartyAddress extends BaseEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="partyAddressSeq")
    @Column( name = "PARTY_ADDRESS_ID" )
    private Long id;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PARTY_ID" )
    private Party party;

    /**
     * тип адреса
     */
    @Column( name = "TYPE_CODE" )
    private String typeCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "TYPE_CODE", insertable = false, updatable = false )
    private AddressType type;

    /**
     * улица
     */
    @Column( name = "STREET" )
    private String street;

    /**
     * Џочтовый индекс
     */
    @Column( name = "ZIP_CODE" )
    private String zipCode;

    /**
     * ѓород
     */
    @Column( name = "CITY_CODE" )
    private String cityCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "CITY_CODE", insertable = false, updatable = false )
    private City city;

    /**
     * регион
     */
    @Column( name = "REGION_CODE" )
    private String regionCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "REGION_CODE", insertable = false, updatable = false )
    private Region region;

    /**
     * страна
     */
    @Column( name = "COUNTRY_CODE" )
    private String countryCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "COUNTRY_CODE", insertable = false, updatable = false )
    private Country country;

    /**
     * номер дома
     */
    @Column( name = "HOUSE_NUMBER" )
    private String house;

    @Override
    public Long getId()
    {
        return id;
    }

    @Override
    public void setId( Long id )
    {
        this.id = id;
    }

    public AddressType getType()
    {
        return type;
    }

    public void setType( AddressType type )
    {
        this.type = type;
    }

    public Region getRegion()
    {
        return region;
    }

    public void setRegion( Region region )
    {
        this.region = region;
    }

    public Country getCountry()
    {
        return country;
    }

    public void setCountry( Country country )
    {
        this.country = country;
    }

    public Party getParty()
    {
        return party;
    }

    public void setParty( Party party )
    {
        this.party = party;
    }

    public String getTypeCode()
    {
        return typeCode;
    }

    public void setTypeCode( String typeCode )
    {
        this.typeCode = typeCode;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet( String street )
    {
        this.street = street;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode( String zipCode )
    {
        this.zipCode = zipCode;
    }

    public String getCityCode()
    {
        return cityCode;
    }

    public void setCityCode( String cityCode )
    {
        this.cityCode = cityCode;
    }

    public String getRegionCode()
    {
        return regionCode;
    }

    public void setRegionCode( String regionCode )
    {
        this.regionCode = regionCode;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public void setCountryCode( String countryCode )
    {
        this.countryCode = countryCode;
    }

    public String getHouse()
    {
        return house;
    }

    public void setHouse( String house )
    {
        this.house = house;
    }
}