package com.active.activecrm.data.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable
{
    @Column( name = "CREATE_DATE" )
    @Temporal( TemporalType.TIMESTAMP )
    protected Date createDate;

    @Column( name = "CREATE_USER" )
    protected String createUser;

    @Column( name = "UPDATE_DATE" )
    @Temporal( TemporalType.TIMESTAMP )
    protected Date updateDate;

    @Column( name = "UPDATE_USER" )
    protected String updateUser;

    public Date getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate( Date createDate )
    {
        this.createDate = createDate;
    }

    public String getCreateUser()
    {
        return createUser;
    }

    public void setCreateUser( String createUser )
    {
        this.createUser = createUser;
    }

    public Date getUpdateDate()
    {
        return updateDate;
    }

    public void setUpdateDate( Date updateDate )
    {
        this.updateDate = updateDate;
    }

    public String getUpdateUser()
    {
        return updateUser;
    }

    public void setUpdateUser( String updateUser )
    {
        this.updateUser = updateUser;
    }

    public abstract Long getId();

    public abstract void setId(Long id);
}
