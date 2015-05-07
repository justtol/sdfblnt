package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.party.Party;

import javax.persistence.*;

@Entity
@SequenceGenerator( name = "opportunitySeq", sequenceName = "OPPORTUNITY_SEQ" )
@Table( name = "OPPORTUNITY" )
public class Opportunity extends BaseEntity
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO, generator = "opportunitySeq" )
    @Column( name = "OPPORTUNITY_ID" )
    private Long id;

    @Column( name = "SALE_PROCESS_INSTANCE_ID" )
    private Long saleProcessInstanceId;

    @Column( name = "QUANTITY" )
    private Long quantity;

    @Column( name = "PRODUCT_ID" )
    private Long productId;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_ID", insertable = false, updatable = false )
    private Product product;

    @Column( name = "PARTY_ID" )
    private Long partyId;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PARTY_ID", insertable = false, updatable = false )
    private Party party;

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

    public Long getSaleProcessInstanceId()
    {
        return saleProcessInstanceId;
    }

    public void setSaleProcessInstanceId( Long saleProcessInstanceId )
    {
        this.saleProcessInstanceId = saleProcessInstanceId;
    }

    public Long getQuantity()
    {
        return quantity;
    }

    public void setQuantity( Long quantity )
    {
        this.quantity = quantity;
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

    public Long getPartyId()
    {
        return partyId;
    }

    public void setPartyId( Long partyId )
    {
        this.partyId = partyId;
    }

    public Party getParty()
    {
        return party;
    }

    public void setParty( Party party )
    {
        this.party = party;
    }
}
