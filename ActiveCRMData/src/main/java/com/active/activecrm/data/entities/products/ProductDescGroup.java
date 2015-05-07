package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.dicts.BaseDictionary;

import javax.persistence.*;
import java.io.Serializable;

/**
 * группа продуктов
 */
@Entity
@Table( name = "PRODUCT_GROUP_DESC" )
public class ProductDescGroup extends BaseDictionary implements Serializable
{

    /**
     * тип группировки
     */
    @Column( name = "PRODUCT_GROUP_TYPE_CODE" )
    private String productGroupTypeCode;

    @ManyToOne
    @JoinColumn( name = "PRODUCT_GROUP_TYPE_CODE", insertable = false, updatable = false )
    private ProductDescGroupType productDescGroupType;

    public String getProductGroupTypeCode()
    {
        return productGroupTypeCode;
    }

    public void setProductGroupTypeCode( String productGroupTypeCode )
    {
        this.productGroupTypeCode = productGroupTypeCode;
    }

    public ProductDescGroupType getProductDescGroupType()
    {
        return productDescGroupType;
    }

    public void setProductDescGroupType( ProductDescGroupType productDescGroupType )
    {
        this.productDescGroupType = productDescGroupType;
    }
}