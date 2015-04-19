package com.active.activecrm.data.entities.party; /***********************************************************************
 * Module:  PartyRoleRel.java
 * Author:  TT
 * Purpose: Defines the Class PartyRoleRel
 ***********************************************************************/

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.dicts.PartyRole;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * отношение Party друг с другом
 */

@Entity
@SequenceGenerator(name="partyRoleRelSeq", sequenceName="PARTY_ROLE_REL_SEQ")
@Table( name = "PARTY_ROLE_REL" )
public class PartyRoleRel extends BaseEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="partyRoleRelSeq")
    @Column( name = "PARTY_ROLE_REL_ID" )
    private Long id;

    /**
     * Paryt Role code
     *
     */
    /*@Column( name = "ROLE_CODE" )
    public String roleCode;*/

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "ROLE_CODE", insertable = false, updatable = false )
    private PartyRole partyRole;

    @Column( name = "ROLE_CODE" )
    private String roleCode;

    /**
     * Код должности
     *
     todo change to code
     */
    @Column( name = "POSITION_CODE" )
    private String positionCode;

    /**
     todo change to code
     */
    @Column( name = "GROUP_CODE" )
    private String groupcode;

    /**
     * основнаЯ контакт из всех контактных лиц длЯ данной организации
     */
    @Column( name = "IS_PRIMARY" )
    private Boolean isPrimary;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "FROM_PARTY_ID" )
    private Party fromParty;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "TO_PARTY_ID" )
    private Party toParty;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "partyRoleRel" )
    private Set<PartyRoleContactInfo> partyRoleContactInfos = new HashSet<>();

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

    public Set< PartyRoleContactInfo > getPartyRoleContactInfos()
    {
        return partyRoleContactInfos;
    }

    public void setPartyRoleContactInfos( Set< PartyRoleContactInfo > partyRoleContactInfos )
    {
        this.partyRoleContactInfos = partyRoleContactInfos;
    }

    public PartyRole getPartyRole()
    {
        return partyRole;
    }

    public void setPartyRole( PartyRole partyRole )
    {
        this.partyRole = partyRole;
    }

    public Party getFromParty()
    {
        return fromParty;
    }

    public void setFromParty( Party fromParty )
    {
        this.fromParty = fromParty;
    }

    public Party getToParty()
    {
        return toParty;
    }

    public void setToParty( Party toParty )
    {
        this.toParty = toParty;
    }

    public String getRoleCode()
    {
        return roleCode;
    }

    public void setRoleCode( String roleCode )
    {
        this.roleCode = roleCode;
    }

    public String getPositionCode()
    {
        return positionCode;
    }

    public void setPositionCode( String positionCode )
    {
        this.positionCode = positionCode;
    }

    public String getGroupcode()
    {
        return groupcode;
    }

    public void setGroupcode( String groupcode )
    {
        this.groupcode = groupcode;
    }

    public Boolean isPrimary()
    {
        return isPrimary;
    }

    public void setIsPrimary( Boolean isPrimary )
    {
        this.isPrimary = isPrimary;
    }
}