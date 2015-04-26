package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * связь группа продуктов
 */
@Entity
@SequenceGenerator(name="productGroupRelSeq", sequenceName="PRODUCT_GROUP_REL_SEQ")
@Table( name = "PRODUCT_GROUP_REL" )
public class ProductGroupRel extends BaseEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="productGroupRelSeq")
    @Column( name = "PARTY_ID" )
    private Long id;

    /**
     * код группы
     */
    @Column( name = "PRODUCT_GROUP_CODE" )
    private String productGroupCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_GROUP_CODE", insertable = false, updatable = false )
    private ProductGroup productGroup;

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

    public String getProductGroupCode()
    {
        return productGroupCode;
    }

    public void setProductGroupCode( String productGroupCode )
    {
        this.productGroupCode = productGroupCode;
    }

    public ProductGroup getProductGroup()
    {
        return productGroup;
    }

    public void setProductGroup( ProductGroup productGroup )
    {
        this.productGroup = productGroup;
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