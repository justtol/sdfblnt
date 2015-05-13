package com.active.activecrm.data;

import java.util.List;

public class PagedData <T>
{
    private Integer totalCount;
    private List<T> data;

    public PagedData( Integer totalCount, List< T > data )
    {
        this.totalCount = totalCount;
        this.data = data;
    }

    public PagedData()
    {
    }

    public Integer getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount( Integer totalCount )
    {
        this.totalCount = totalCount;
    }

    public List< T > getData()
    {
        return data;
    }

    public void setData( List< T > data )
    {
        this.data = data;
    }
}
