package com.active.activecrm.data.entities.party; /***********************************************************************
 * Module:  PartyRoleRel.java
 * Author:  TT
 * Purpose: Defines the Class PartyRoleRel
 ***********************************************************************/

import com.active.activecrm.data.entities.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * отношение Party друг с другом
 *
 * @pdOid 1c4b88dc-456f-4557-932b-c74f78480bb9
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
    @Column( name = "ROLE_CODE" )
    public String roleCode;

    /**
     * Код должности
     *
     todo change to code
     */
    @Column( name = "POSITION_CODE" )
    public String positionCode;

    /**
     todo change to code
     */
    @Column( name = "GROUP_CODE" )
    public String groupcode;

    /**
     * основнаЯ контакт из всех контактных лиц длЯ данной организации
     */
    @Column( name = "IS_PRIMARY" )
    public String isPrimary;

    /**
     * @pdRoleInfo migr=no name=Party assc=partyRoleRelTo1 mult=0..1 side=A
     */
//    public Party party;


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

    public String getIsPrimary()
    {
        return isPrimary;
    }

    public void setIsPrimary( String isPrimary )
    {
        this.isPrimary = isPrimary;
    }
}