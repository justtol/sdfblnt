package com.active.activecrm.data.entities.products;


import com.active.activecrm.data.entities.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator( name = "productCaseRelSeq", sequenceName = "PRODUCT_CASE_REL_SEQ" )
@Table( name = "PRODUCT_CASE_REL" )
public class ProductCaseRel extends BaseEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="productCaseRelSeq")
    @Column( name = "PRODUCT_CASE_REL_ID" )
    private Long id;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "PRODUCT_ID" )
    private Product product;

    /** todo implement link to interaction */
    @Column( name = "CASE_ID" )
    private String caseId;

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

    public Product getProduct()
    {
        return product;
    }

    public void setProduct( Product product )
    {
        this.product = product;
    }

    public String getCaseId()
    {
        return caseId;
    }

    public void setCaseId( String caseId )
    {
        this.caseId = caseId;
    }
}