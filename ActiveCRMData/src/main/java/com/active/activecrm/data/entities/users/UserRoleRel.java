package com.active.activecrm.data.entities.users;


import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.dicts.UserRole;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name="userRoleSeq", sequenceName="USER_ROLE_REL_SEQ")
@Table( name = "USER_ROLE_REL" )
public class UserRoleRel extends BaseEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="userRoleSeq")
    @Column( name = "USER_ROLE_REL_ID" )
    private Long id;

    @Column( name = "ROLE_CODE" )
    private String roleCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "ROLE_CODE", insertable = false, updatable = false )
    private UserRole role;

    @Column( name = "USER_CODE" )
    private String userCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "USER_CODE", insertable = false, updatable = false )
    private User user;

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

    public UserRole getRole()
    {
        return role;
    }

    public void setRole( UserRole role )
    {
        this.role = role;
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
}
