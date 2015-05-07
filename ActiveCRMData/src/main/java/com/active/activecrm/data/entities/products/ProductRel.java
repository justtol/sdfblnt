package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;

import javax.persistence.*;

@Entity
@SequenceGenerator( name = "productRelSeq", sequenceName = "PRODUCT_REL_SEQ" )
@Table( name = "PRODUCT_REL" )
public class ProductRel extends BaseEntity
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO, generator = "productRelSeq" )
    @Column( name = "PRODUCT_REL_ID" )
    private Long id;

    @Column( name = "FROM_PRODUCT_CODE" )
    private String fromProductCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "FROM_PRODUCT_CODE", insertable = false, updatable = false )
    private Product fromProduct;

    @Column( name = "TO_PRODUCT_CODE" )
    private String toProductCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "TO_PRODUCT_CODE", insertable = false, updatable = false )
    private Product toProduct;

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

    public String getFromProductCode()
    {
        return fromProductCode;
    }

    public void setFromProductCode( String fromProductCode )
    {
        this.fromProductCode = fromProductCode;
    }

    public Product getFromProduct()
    {
        return fromProduct;
    }

    public void setFromProduct( Product fromProduct )
    {
        this.fromProduct = fromProduct;
    }

    public String getToProductCode()
    {
        return toProductCode;
    }

    public void setToProductCode( String toProductCode )
    {
        this.toProductCode = toProductCode;
    }

    public Product getToProduct()
    {
        return toProduct;
    }

    public void setToProduct( Product toProduct )
    {
        this.toProduct = toProduct;
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
