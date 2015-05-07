package com.active.activecrm.data.entities.products;


import com.active.activecrm.data.entities.dicts.BaseDictionary;
import com.active.activecrm.data.entities.dicts.PartyRole;
import com.active.activecrm.data.entities.party.Party;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * справочник продуктов
 */
@Entity
@Table( name = "PRODUCT_DESC" )
public class ProductDesc extends BaseDictionary implements Serializable
{
    
    /**
     * Class длЯ работы с данным продуктом
     
    private java.lang.String workClass;*/

    @Column( name = "LIFECYCLE_FLOW_NAME" )
    private String lifecycleFlowName;

    /**
     * max количество продаж длЯ продуктов
     */
    @Column( name = "MAX_SALES_COUNT" )
    private int maxSalesCount;

    /** отображать ли данные на UI */
    @Column( name = "IS_HIDDEN" )
    private Boolean isHidden;

    /** Party котораЯ выпустила продукт */
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "ISSUER_PARTY_ID" )
    private Party issuerParty;

    /** Party роль Party котораЯ выпустила продукт */
    @Column( name = "ISSUER_PARTY_ROLE_CODE" )
    private String issuerPartyRoleCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "ISSUER_PARTY_ROLE_CODE", insertable = false, updatable = false )
    private PartyRole issuerPartyRole;

    /**Выполнять проверку статуса продукта независимо от наличия подключений */
    @Column( name = "FORCE_CHECK" )
    private Boolean forceCheck;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "productDesc" )
    private Set<ProductDescGroupRel > productDescGroupRels = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "productDesc" )
    private Set<ProductInterest> productInterests = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "toProductDesc" )
    private Set<ProductDescRel> toProductDescRels = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "fromProductDesc" )
    private Set<ProductDescRel> fromProductDescRels = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "productDesc" )
    private Set<Product> products = new HashSet<>();

    public Set< ProductDescGroupRel > getProductDescGroupRels()
    {
        return productDescGroupRels;
    }

    public void setProductDescGroupRels( Set< ProductDescGroupRel > productDescGroupRels )
    {
        this.productDescGroupRels = productDescGroupRels;
    }

    public Set< ProductInterest > getProductInterests()
    {
        return productInterests;
    }

    public void setProductInterests( Set< ProductInterest > productInterests )
    {
        this.productInterests = productInterests;
    }

    public Set< ProductDescRel > getToProductDescRels()
    {
        return toProductDescRels;
    }

    public void setToProductDescRels( Set< ProductDescRel > toProductDescRels )
    {
        this.toProductDescRels = toProductDescRels;
    }

    public Set< ProductDescRel > getFromProductDescRels()
    {
        return fromProductDescRels;
    }

    public void setFromProductDescRels( Set< ProductDescRel > fromProductDescRels )
    {
        this.fromProductDescRels = fromProductDescRels;
    }

    public Set< Product > getProducts()
    {
        return products;
    }

    public void setProducts( Set< Product > products )
    {
        this.products = products;
    }

    public String getLifecycleFlowName()
    {
        return lifecycleFlowName;
    }

    public void setLifecycleFlowName( String lifecycleFlowName )
    {
        this.lifecycleFlowName = lifecycleFlowName;
    }

    public int getMaxSalesCount()
    {
        return maxSalesCount;
    }

    public void setMaxSalesCount( int maxSalesCount )
    {
        this.maxSalesCount = maxSalesCount;
    }

    public Boolean isHidden()
    {
        return isHidden;
    }

    public void setIsHidden( Boolean isHidden )
    {
        this.isHidden = isHidden;
    }

    public Party getIssuerParty()
    {
        return issuerParty;
    }

    public void setIssuerParty( Party issuerParty )
    {
        this.issuerParty = issuerParty;
    }

    public String getIssuerPartyRoleCode()
    {
        return issuerPartyRoleCode;
    }

    public void setIssuerPartyRoleCode( String issuerPartyRoleCode )
    {
        this.issuerPartyRoleCode = issuerPartyRoleCode;
    }

    public PartyRole getIssuerPartyRole()
    {
        return issuerPartyRole;
    }

    public void setIssuerPartyRole( PartyRole issuerPartyRole )
    {
        this.issuerPartyRole = issuerPartyRole;
    }

    public Boolean isForceCheck()
    {
        return forceCheck;
    }

    public void setForceCheck( Boolean forceCheck )
    {
        this.forceCheck = forceCheck;
    }
}