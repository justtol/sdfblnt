package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ‘вЯзь продуктов друг с другом
 */
@Entity
@SequenceGenerator( name = "productDescRelSeq", sequenceName = "PRODUCT_DESC_REL_SEQ" )
@Table( name = "PRODUCT_DESC_REL" )
public class ProductDescRel extends BaseEntity implements Serializable
{

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO, generator = "productDescRelSeq" )
    @Column( name = "PRODUCT_DESC_REL_ID" )
    private Long id;

    @Column( name = "FROM_PRODUCT_DESC_CODE" )
    private String fromProductDescCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "FROM_PRODUCT_DESC_CODE", insertable = false, updatable = false )
    private ProductDesc fromProductDesc;

    @Column( name = "TO_PRODUCT_DESC_CODE" )
    private String toProductDescCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "TO_PRODUCT_DESC_CODE", insertable = false, updatable = false )
    private ProductDesc toProductDesc;

    /**
     * тип связи продуктов
     */
    @Column( name = "PRODUCT_DESC_REL_TYPE_CODE" )
    private String productDescRelTypeCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_DESC_REL_TYPE_CODE", insertable = false, updatable = false )
    private ProductDescRelType productDescRelType;

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

    public String getFromProductDescCode()
    {
        return fromProductDescCode;
    }

    public void setFromProductDescCode( String fromProductDescCode )
    {
        this.fromProductDescCode = fromProductDescCode;
    }

    public ProductDesc getFromProductDesc()
    {
        return fromProductDesc;
    }

    public void setFromProductDesc( ProductDesc fromProductDesc )
    {
        this.fromProductDesc = fromProductDesc;
    }

    public String getToProductDescCode()
    {
        return toProductDescCode;
    }

    public void setToProductDescCode( String toProductDescCode )
    {
        this.toProductDescCode = toProductDescCode;
    }

    public ProductDesc getToProductDesc()
    {
        return toProductDesc;
    }

    public void setToProductDesc( ProductDesc toProductDesc )
    {
        this.toProductDesc = toProductDesc;
    }

    public String getProductDescRelTypeCode()
    {
        return productDescRelTypeCode;
    }

    public void setProductDescRelTypeCode( String productDescRelTypeCode )
    {
        this.productDescRelTypeCode = productDescRelTypeCode;
    }

    public ProductDescRelType getProductDescRelType()
    {
        return productDescRelType;
    }

    public void setProductDescRelType( ProductDescRelType productDescRelType )
    {
        this.productDescRelType = productDescRelType;
    }
}