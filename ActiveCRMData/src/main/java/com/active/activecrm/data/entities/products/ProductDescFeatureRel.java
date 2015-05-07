package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;

import javax.persistence.*;

@Entity
@SequenceGenerator( name = "productDescFeatureRelSeq", sequenceName = "PRODUCT_DESC_FEATURE_REL_SEQ" )
@Table( name = "PRODUCT_DESC_FEATURE_REL" )
public class ProductDescFeatureRel extends BaseEntity
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO, generator = "productDescFeatureRelSeq" )
    @Column( name = "PRODUCT_DESC_FEATURE_REL_ID" )
    private Long id;

    @Column( name = "VALUE" )
    private String value;

    @Column( name = "CONDITION" )
    private String condition;

    @Column( name = "PRODUCT_DESC_CODE" )
    private String productDescCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_DESC_CODE", insertable = false, updatable = false )
    private ProductDesc productDesc;

    @Column( name = "PRODUCT_DESC_FEATURE_CODE" )
    private String productDescFeatureCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_DESC_FEATURE_CODE", insertable = false, updatable = false )
    private ProductDescFeature productDescFeature;

    @Column( name = "PRODUCT_DESC_REL_ID" )
    private Long productDescRelId;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_DESC_REL_ID", insertable = false, updatable = false )
    private ProductDescRel productDescRel;

    @Column( name = "TARIFF_CODE" )
    private String tariffCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "TARIFF_CODE", insertable = false, updatable = false )
    private Tariff tariff;

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

    public String getValue()
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }

    public String getCondition()
    {
        return condition;
    }

    public void setCondition( String condition )
    {
        this.condition = condition;
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

    public Long getProductDescRelId()
    {
        return productDescRelId;
    }

    public void setProductDescRelId( Long productDescRelId )
    {
        this.productDescRelId = productDescRelId;
    }

    public ProductDescRel getProductDescRel()
    {
        return productDescRel;
    }

    public void setProductDescRel( ProductDescRel productDescRel )
    {
        this.productDescRel = productDescRel;
    }

    public String getTariffCode()
    {
        return tariffCode;
    }

    public void setTariffCode( String tariffCode )
    {
        this.tariffCode = tariffCode;
    }

    public Tariff getTariff()
    {
        return tariff;
    }

    public void setTariff( Tariff tariff )
    {
        this.tariff = tariff;
    }
}
