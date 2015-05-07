package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.dicts.PartyRole;
import com.active.activecrm.data.entities.party.Party;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/** экземплЯры конкретных продуктов */
@Entity
@SequenceGenerator(name="productSeq", sequenceName="PRODUCT_SEQ")
@Table( name = "PRODUCT" )
public class Product extends BaseEntity implements Serializable
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO, generator="productSeq")
   @Column( name = "PRODUCT_ID" )
   private Long id;

   @Column( name = "PRODUCT_DESC_CODE" )
   private String productDescCode;

   @ManyToOne( fetch = FetchType.LAZY )
   @JoinColumn( name = "PRODUCT_DESC_CODE", insertable = false, updatable = false )
   private ProductDesc productDesc;

   @Column( name = "NAME" )
   private String name;

   /** код статуса */
   @Column( name = "PRODUCT_STATUS_CODE" )
   private String productSatusCode;

   @ManyToOne( fetch = FetchType.LAZY )
   @JoinColumn( name = "PRODUCT_STATUS_CODE", insertable = false, updatable = false )
   private ProductStatus productSatus;

   /**
    * ???
    */
   @Column( name = "GROUP_CODE" )
   private String groupCode;

   /** Party роль Party которой принадлежит продукт
    * ??? */
   @Column( name = "OWNER_PARTY_ROLE_CODE" )
   private String ownerPartyRoleCode;

   @ManyToOne( fetch = FetchType.LAZY )
   @JoinColumn( name = "OWNER_PARTY_ROLE_CODE", insertable = false, updatable = false )
   private PartyRole ownerPartyRole;

   /** Party которой принадлежит продукт
    * ??? */
   @ManyToOne( fetch = FetchType.LAZY )
   @JoinColumn( name = "OWNER_PARTY_ID" )
   private Party ownerPartyId;

   /** код source system */
   @Column( name = "SRC_SYS_CODE" )
   private String srcSysCode;

   @Column( name = "IS_PRIMARY" )
   private Boolean isPrimary;

   /** id справочника причины отказа клиента или банка*/
   @Column( name = "FAILURE_CAUSE_CODE" )
   private String failureCauseCode;

   @ManyToOne( fetch = FetchType.LAZY )
   @JoinColumn( name = "FAILURE_CAUSE_CODE", insertable = false, updatable = false )
   private FailureCause failureCause;

   /** уполномоченное лица */
   @ManyToOne( fetch = FetchType.LAZY )
   @JoinColumn( name = "AUTHORIZED_PARTY_ID" )
   private Party authorizedParty;

   /** клиент ??? */
   @ManyToOne( fetch = FetchType.LAZY )
   @JoinColumn( name = "CLIENT_ID" )
   private Party client;

   /** Телефон уполномоченного лица  */
   @Column( name = "PHONE" )
   private String phone;

   /** Идентификатор документа */
   @Column( name = "DOC_ID" )
   private String docId;

   /** Номер документа */
   @Column( name = "DOC_NUMBER" )
   private String docNumber;

   /** Дата подключения продукта */
   @Column( name = "START_USING_DATE" )
   @Temporal( TemporalType.TIMESTAMP )
   private Date startUsingDate;

   /** Дата отключения продукта */
   @Column( name = "STOP_USING_DATE" )
   @Temporal( TemporalType.TIMESTAMP )
   private Date stopUsingDate;

   @OneToMany( fetch = FetchType.LAZY, mappedBy = "product" )
   private Set<ProductPartyRoleRel> productPartyRoleRels = new HashSet<>();

   @OneToMany( fetch = FetchType.LAZY, mappedBy = "product" )
   private Set<ProductFeatureValue> productFeatureValues = new HashSet<>();

   public Set< ProductFeatureValue > getProductFeatureValues()
   {
      return productFeatureValues;
   }

   public void setProductFeatureValues( Set< ProductFeatureValue > productFeatureValues )
   {
      this.productFeatureValues = productFeatureValues;
   }

   public ProductStatus getProductSatus()
   {
      return productSatus;
   }

   public void setProductSatus( ProductStatus productSatus )
   {
      this.productSatus = productSatus;
   }

   public Set< ProductPartyRoleRel > getProductPartyRoleRels()
   {
      return productPartyRoleRels;
   }

   public void setProductPartyRoleRels( Set< ProductPartyRoleRel > productPartyRoleRels )
   {
      this.productPartyRoleRels = productPartyRoleRels;
   }

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

   public String getName()
   {
      return name;
   }

   public void setName( String name )
   {
      this.name = name;
   }

   public String getProductSatusCode()
   {
      return productSatusCode;
   }

   public void setProductSatusCode( String statusCode )
   {
      this.productSatusCode = statusCode;
   }

   public String getGroupCode()
   {
      return groupCode;
   }

   public void setGroupCode( String groupCode )
   {
      this.groupCode = groupCode;
   }

   public String getOwnerPartyRoleCode()
   {
      return ownerPartyRoleCode;
   }

   public void setOwnerPartyRoleCode( String ownerPartyRoleCode )
   {
      this.ownerPartyRoleCode = ownerPartyRoleCode;
   }

   public PartyRole getOwnerPartyRole()
   {
      return ownerPartyRole;
   }

   public void setOwnerPartyRole( PartyRole ownerPartyRole )
   {
      this.ownerPartyRole = ownerPartyRole;
   }

   public Party getOwnerPartyId()
   {
      return ownerPartyId;
   }

   public void setOwnerPartyId( Party ownerPartyId )
   {
      this.ownerPartyId = ownerPartyId;
   }

   public String getSrcSysCode()
   {
      return srcSysCode;
   }

   public void setSrcSysCode( String srcSysCode )
   {
      this.srcSysCode = srcSysCode;
   }

   public Boolean isPrimary()
   {
      return isPrimary;
   }

   public void setIsPrimary( Boolean isPrimary )
   {
      this.isPrimary = isPrimary;
   }

   public String getFailureCauseCode()
   {
      return failureCauseCode;
   }

   public void setFailureCauseCode( String failureCauseCode )
   {
      this.failureCauseCode = failureCauseCode;
   }

   public FailureCause getFailureCause()
   {
      return failureCause;
   }

   public void setFailureCause( FailureCause failureCause )
   {
      this.failureCause = failureCause;
   }

   public Party getAuthorizedParty()
   {
      return authorizedParty;
   }

   public void setAuthorizedParty( Party authorizedParty )
   {
      this.authorizedParty = authorizedParty;
   }

   public Party getClient()
   {
      return client;
   }

   public void setClient( Party client )
   {
      this.client = client;
   }

   public String getPhone()
   {
      return phone;
   }

   public void setPhone( String phone )
   {
      this.phone = phone;
   }

   public String getDocId()
   {
      return docId;
   }

   public void setDocId( String docId )
   {
      this.docId = docId;
   }

   public String getDocNumber()
   {
      return docNumber;
   }

   public void setDocNumber( String docNumber )
   {
      this.docNumber = docNumber;
   }

   public Date getStartUsingDate()
   {
      return startUsingDate;
   }

   public void setStartUsingDate( Date startUsingDate )
   {
      this.startUsingDate = startUsingDate;
   }

   public Date getStopUsingDate()
   {
      return stopUsingDate;
   }

   public void setStopUsingDate( Date stopUsingDate )
   {
      this.stopUsingDate = stopUsingDate;
   }
}