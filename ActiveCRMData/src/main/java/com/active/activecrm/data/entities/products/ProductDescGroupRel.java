package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * связь группа продуктов
 */
@Entity
@SequenceGenerator(name="productDescGroupRelSeq", sequenceName="PRODUCT_DESC_GROUP_REL_SEQ")
@Table( name = "PRODUCT_DESC_GROUP_REL" )
public class ProductDescGroupRel extends BaseEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="productDescGroupRelSeq")
    @Column( name = "PRODUCT_DESC_GROUP_REL_ID" )
    private Long id;

    /**
     * код группы
     */
    @Column( name = "PRODUCT_DESC_GROUP_CODE" )
    private String productDescGroupCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_DESC_GROUP_CODE", insertable = false, updatable = false )
    private ProductDescGroup productDescGroup;

    /**
     * продукт
     */
    @Column( name = "PRODUCT_DESC_CODE" )
    private String productDescCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_DESC_CODE", insertable = false, updatable = false )
    private ProductDesc productDesc;

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

    public String getProductDescGroupCode()
    {
        return productDescGroupCode;
    }

    public void setProductDescGroupCode( String productGroupCode )
    {
        this.productDescGroupCode = productGroupCode;
    }

    public ProductDescGroup getProductDescGroup()
    {
        return productDescGroup;
    }

    public void setProductDescGroup( ProductDescGroup productDescGroup )
    {
        this.productDescGroup = productDescGroup;
    }

    public String getProductDescCode()
    {
        return productDescCode;
    }

    public void setProductDescCode( String productDescCode )
    {
        this.productDescCode = productDescCode;
    }

    public ProductDesc getProductDesc()
    {
        return productDesc;
    }

    public void setProductDesc( ProductDesc productDesc )
    {
        this.productDesc = productDesc;
    }
}