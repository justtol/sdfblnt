package com.active.activecrm.data.entities.dicts;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class BaseDictionary implements Serializable
{
    @Id
    @Column( name = "CODE" )
    protected String code;

    @Column( name = "CODE_NAME" )
    protected String name;

    @Column( name = "DESCRIPTION" )
    protected String description;

    /** код source system */
    @Column( name = "SRC_SYS_CODE" )
    protected String srcSysCode;

    /** код группы */
    @Column( name = "GROUP_CODE" )
    protected String groupCode;

    @Column( name = "IS_ACTIVE" )
    protected Boolean isActive;

    @Column( name = "SORT_ORDER" )
    protected double sortOrder;

    public double getSortOrder()
    {
        return sortOrder;
    }

    public void setSortOrder( double sortOrder )
    {
        this.sortOrder = sortOrder;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Boolean isActive()
    {
        return isActive;
    }

    public void setIsActive( Boolean isActive )
    {
        this.isActive = isActive;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getSrcSysCode()
    {
        return srcSysCode;
    }

    public void setSrcSysCode( String srcSysCode )
    {
        this.srcSysCode = srcSysCode;
    }

    public String getGroupCode()
    {
        return groupCode;
    }

    public void setGroupCode( String groupCode )
    {
        this.groupCode = groupCode;
    }
}
