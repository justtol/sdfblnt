package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator( name = "productInterestSeq", sequenceName = "PRODUCT_INTEREST_SEQ" )
@Table( name = "PRODUCT_INTEREST" )
public class ProductInterest extends BaseEntity implements Serializable
{

   @Id
   @GeneratedValue( strategy = GenerationType.AUTO, generator = "productInterestSeq" )
   @Column( name = "PRODUCT_DESC_REL_ID" )
   private Long id;

   @Column( name = "PRODUCT_DESC_CODE" )
   private String productDescCode;

   @ManyToOne( fetch = FetchType.LAZY )
   @JoinColumn( name = "PRODUCT_DESC_CODE", insertable = false, updatable = false )
   private ProductDesc productDesc;

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

   public String getCaseId()
   {
      return caseId;
   }

   public void setCaseId( String caseId )
   {
      this.caseId = caseId;
   }
}