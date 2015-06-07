package com.active.activecrm.data.entities.party; /**
 * ********************************************************************
 * Module:  PartyRoleContactInfo.java
 * Author:  TT
 * Purpose: Defines the Class PartyRoleContactInfo
 * *********************************************************************
 */

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.dicts.ContactInfoType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * контактнаЯ информациЯ (тел,email, факс...)
 */
@Entity
@SequenceGenerator(name="partyRoleContactInfoSeq", sequenceName="PARTY_ROLE_CONTACT_INFO_SEQ")
@Table( name = "PARTY_ROLE_CONTACT_INFO" )
public class PartyRoleContactInfo extends BaseEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="partyRoleContactInfoSeq")
    @Column( name = "PARTY_ROLE_CONTACT_INFO_ID" )
    private Long id;


    @Column( name = "PARTY_ROLE_REL_ID" )
    private Long partyRoleRelId;

    /**
     * ссылка на party role rel
     */
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PARTY_ROLE_REL_ID", insertable = false, updatable = false )
    private PartyRoleRel partyRoleRel;

    /**
     * тип контактной инф (тел, email, fax)
     */
    @Column( name = "CONTACT_INFO_TYPE_CODE" )
    private String typeCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "CONTACT_INFO_TYPE_CODE", insertable = false, updatable = false )
    private ContactInfoType contactInfoType;

    /**
     * значение
     */
    @Column( name = "CONTACT_VALUE" )
    private String value;

    /**
     * Код source system
     */
    @Column( name = "SRC_SYS_CODE" )
    private String srcSysCode;

    /**
     * основнаЯ контакнтаЯ инф., т.е. из всех телефонов
     */
    @Column( name = "IS_PRIMARY" )
    private Boolean isPrimary;

    /**
     * хранит последние 10 цифр тел.номера для поиска на равенство по номеру телефону
     */
    @Column( name = "VALUE_SEARCH" )
    private String valueSearch;

    /**
     * признак не корректных данных
     */
    @Column( name = "IS_INCORRECT" )
    private Boolean isIncorrect;

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

    public Long getPartyRoleRelId()
    {
        return partyRoleRelId;
    }

    public void setPartyRoleRelId( Long partyRoleRelId )
    {
        this.partyRoleRelId = partyRoleRelId;
    }

    public PartyRoleRel getPartyRoleRel()
    {
        return partyRoleRel;
    }

    public void setPartyRoleRel( PartyRoleRel partyRoleRel )
    {
        this.partyRoleRel = partyRoleRel;
    }

    public String getTypeCode()
    {
        return typeCode;
    }

    public void setTypeCode( String typeCode )
    {
        this.typeCode = typeCode;
    }

    public ContactInfoType getContactInfoType()
    {
        return contactInfoType;
    }

    public void setContactInfoType( ContactInfoType contactInfoType )
    {
        this.contactInfoType = contactInfoType;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }

    public String getSrcSysCode()
    {
        return srcSysCode;
    }

    public void setSrcSysCode( String srcSysCode )
    {
        this.srcSysCode = srcSysCode;
    }

    public Boolean isPrimary()
    {
        return isPrimary;
    }

    public void setIsPrimary( Boolean isPrimary )
    {
        this.isPrimary = isPrimary;
    }

    public String getValueSearch()
    {
        return valueSearch;
    }

    public void setValueSearch( String valueSearch )
    {
        this.valueSearch = valueSearch;
    }

    public Boolean isIncorrect()
    {
        return isIncorrect;
    }

    public void setIsIncorrect( Boolean isIncorrect )
    {
        this.isIncorrect = isIncorrect;
    }
}