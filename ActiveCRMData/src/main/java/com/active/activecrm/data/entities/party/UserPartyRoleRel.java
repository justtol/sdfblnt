package com.active.activecrm.data.entities.party;

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.dicts.UserPartyRole;
import com.active.activecrm.data.entities.users.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name="userPartyRoleRelSeq", sequenceName="USER_PARTY_ROLE_REL_SEQ")
@Table( name = "USER_PARTY_ROLE_REL" )
public class UserPartyRoleRel extends BaseEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="userPartyRoleRelSeq")
    @Column( name = "USER_ROLE_REL_ID" )
    private Long id;

    @Column( name = "USER_CODE" )
    private String userCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "USER_CODE", insertable = false, updatable = false )
    private User user;

    @Column( name = "PARTY_ID" )
    private Long partyId;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PARTY_ID", insertable = false, updatable = false )
    private Party party;

    @Column( name = "USER_PARTY_ROLE_CODE" )
    private String userPartyRoleCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "USER_PARTY_ROLE_CODE", insertable = false, updatable = false )
    private UserPartyRole userPartyRole;

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

    public String getUserCode()
    {
        return userCode;
    }

    public void setUserCode( String userCode )
    {
        this.userCode = userCode;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser( User user )
    {
        this.user = user;
    }

    public Long getPartyId()
    {
        return partyId;
    }

    public void setPartyId( Long partyId )
    {
        this.partyId = partyId;
    }

    public Party getParty()
    {
        return party;
    }

    public void setParty( Party party )
    {
        this.party = party;
    }

    public String getUserPartyRoleCode()
    {
        return userPartyRoleCode;
    }

    public void setUserPartyRoleCode( String userPartyRoleCode )
    {
        this.userPartyRoleCode = userPartyRoleCode;
    }

    public UserPartyRole getUserPartyRole()
    {
        return userPartyRole;
    }

    public void setUserPartyRole( UserPartyRole userPartyRole )
    {
        this.userPartyRole = userPartyRole;
    }
}
