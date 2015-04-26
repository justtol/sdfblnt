package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.party.Party;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Связь продуктов с PartyRole
 * ( в том числе продукты конкурентов )
 */
@Entity
@SequenceGenerator(name="productPartyRoleRelSeq", sequenceName="PRODUCT_PARTY_ROLE_REL_SEQ")
@Table( name = "PRODUCT_PARTY_ROLE_REL" )
public class ProductPartyRoleRel extends BaseEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="productPartyRoleRelSeq")
    @Column( name = "PRODUCT_PARTY_ROLE_REL_ID" )
    private Long id;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PARTY_ID" )
    private Party party;

    /** Party Role code */
    @Column( name = "PRODUCT_PARTY_ROLE_CODE" )
    private String productPartyRoleCode;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_PARTY_ROLE_CODE", insertable = false, updatable = false )
    private ProductPartyRole productPartyRole;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_ID" )
    public Product product;

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

    public Party getParty()
    {
        return party;
    }

    public void setParty( Party party )
    {
        this.party = party;
    }

    public String getProductPartyRoleCode()
    {
        return productPartyRoleCode;
    }

    public void setProductPartyRoleCode( String productPartyRoleCode )
    {
        this.productPartyRoleCode = productPartyRoleCode;
    }

    public ProductPartyRole getProductPartyRole()
    {
        return productPartyRole;
    }

    public void setProductPartyRole( ProductPartyRole productPartyRole )
    {
        this.productPartyRole = productPartyRole;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct( Product product )
    {
        this.product = product;
    }
}