package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@SequenceGenerator( name = "productFeatureValueSeq", sequenceName = "PRODUCT_FEATURE_VALUE_SEQ" )
@Table( name = "PRODUCT_FEATURE_VALUE" )
public class ProductFeatureValue extends BaseEntity
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO, generator = "productFeatureValueSeq" )
    @Column( name = "PRODUCT_FEATURE_VALUE_ID" )
    private Long id;

    @Column( name = "PRODUCT_DESC_FEATURE_CODE" )
    private String productDescFeatureCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_DESC_FEATURE_CODE", insertable = false, updatable = false )
    private ProductDescFeature productDescFeature;

    @Column( name = "PRODUCT_ID" )
    private Long productId;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_ID", insertable = false, updatable = false )
    private Product product;

    @Column( name = "FROM_DATE" )
    @Temporal( TemporalType.DATE )
    private Date fromDate;

    @Column( name = "THRU_DATE" )
    @Temporal( TemporalType.DATE )
    private Date thruDate;

    @Column( name = "VALUE" )
    private String value;

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

    public String getProductDescFeatureCode()
    {
        return productDescFeatureCode;
    }

    public void setProductDescFeatureCode( String productDescFeatureCode )
    {
        this.productDescFeatureCode = productDescFeatureCode;
    }

    public ProductDescFeature getProductDescFeature()
    {
        return productDescFeature;
    }

    public void setProductDescFeature( ProductDescFeature productDescFeature )
    {
        this.productDescFeature = productDescFeature;
    }

    public Long getProductId()
    {
        return productId;
    }

    public void setProductId( Long productId )
    {
        this.productId = productId;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct( Product product )
    {
        this.product = product;
    }

    public Date getFromDate()
    {
        return fromDate;
    }

    public void setFromDate( Date fromDate )
    {
        this.fromDate = fromDate;
    }

    public Date getThruDate()
    {
        return thruDate;
    }

    public void setThruDate( Date thruDate )
    {
        this.thruDate = thruDate;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }
}
