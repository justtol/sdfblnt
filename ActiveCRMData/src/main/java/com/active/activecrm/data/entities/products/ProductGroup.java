package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.dicts.BaseDictionary;

import javax.persistence.*;
import java.io.Serializable;

/**
 * группа продуктов
 */
@Entity
@Table( name = "PRODUCT_GROUP" )
public class ProductGroup extends BaseDictionary implements Serializable
{

    /**
     * тип группировки
     */
    @Column( name = "PRODUCT_GROUP_TYPE_CODE" )
    private String productGroupTypeCode;

    @ManyToOne
    @JoinColumn( name = "PRODUCT_GROUP_TYPE_CODE", insertable = false, updatable = false )
    private ProductGroupType productGroupType;

    public String getProductGroupTypeCode()
    {
        return productGroupTypeCode;
    }

    public void setProductGroupTypeCode( String productGroupTypeCode )
    {
        this.productGroupTypeCode = productGroupTypeCode;
    }

    public ProductGroupType getProductGroupType()
    {
        return productGroupType;
    }

    public void setProductGroupType( ProductGroupType productGroupType )
    {
        this.productGroupType = productGroupType;
    }
}