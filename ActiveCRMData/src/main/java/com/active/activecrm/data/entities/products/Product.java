package com.active.activecrm.data.entities.products; /***********************************************************************
 * Module:  Product.java
 * Author:  TT
 * Purpose: Defines the Class Product
 ***********************************************************************/

/** экземплЯры конкретных продуктов
 * 
 * @pdOid 483f4c7e-25bf-4946-8dc7-61ed8273de4c */
public class Product {
   /** id-к
    * 
    * @pdOid d79277e1-fbfd-4b30-98ae-a7e3eb8ab858 */
   public java.lang.String pyID;
   /** pk общий длЯ всех Party
    * 
    * @pdOid 0b9d0b65-1bc9-476b-8fd8-e803c3cd5025 */
   public java.lang.String pzinskey;
   /** @pdOid ea168643-9932-4f3b-951a-d89cbad10224 */
   public java.lang.String pxinsname;
   /** Entity class
    * 
    * @pdOid 8830b540-bee5-4269-951e-b94582cbc95f */
   public java.lang.String pxobjclass;
   /** @pdOid aae07bfb-c8f6-4d70-a5e5-f239755a5271 */
   public java.lang.String pylabel;
   /** @pdOid 8c56ab3c-5120-421d-8907-bf22d942cf73 */
   public java.util.Date pxcreatedatetime;
   /** @pdOid 8bd68408-3032-4866-8e0d-67d799f2f352 */
   public java.lang.String pxcreateopname;
   /** @pdOid 5d0622a1-cd95-4d0c-a0cf-dcbb9d248c36 */
   public java.lang.String pxcreateoperator;
   /** @pdOid 50e4bf60-e996-40e1-8292-48cd91ad201e */
   public java.lang.String pxcreatesystemid;
   /** @pdOid ba89a10a-ee73-488a-af78-ac1157ae0674 */
   public java.util.Date pxupdatedatetime;
   /** @pdOid d70a2a9e-213e-45c7-b490-5503685f1a9c */
   public java.lang.String pxupdateopname;
   /** @pdOid 308f21e3-d2df-4530-92e4-cb36c0ec0b06 */
   public java.lang.String pxupdateoperator;
   /** @pdOid ff856a55-6c0e-4554-ac87-0354724f5a80 */
   public java.lang.String pxupdatesystemid;
   /** @pdOid 9c765daf-57b3-4bcf-83b7-2cc35a19ce5a */
   public java.lang.String pyrulesetname;
   /** @pdOid 5052e680-7573-48c1-8af8-ef4df1357075 */
   public java.lang.String pzpvstream;
   /** код продукта
    * 
    * @pdOid 14811038-0098-4248-bfe1-6f51aa059ec0 */
   public java.lang.String code;
   /** @pdOid 352b3761-8920-499d-99cd-97d851963c8d */
   public java.lang.String name;
   /** код статуса
    * 
    * @pdOid 3392aacd-d2c7-4e42-bdee-8582fe85d43b */
   public java.lang.String statusCode;
   /** код группа продукта
    * 
    * @pdOid a4c05302-6497-4bc1-ae77-5629b6a32b5e */
   public java.lang.String groupcode;
   /** Party роль Party которой принадлежит продукт
    * 
    * @pdOid 98a85cdf-5812-4acf-87ec-5c4c5ada1228 */
   public java.lang.String ownerpartyrolecode;
   /** Party которой принадлежит продукт
    * 
    * @pdOid 3704dff2-8bce-4258-9d86-a5c34279cd42 */
   public java.lang.String ownerPartyId;
   /** код source system
    * 
    * @pdOid 8e1d97d3-aed8-41d1-9d0f-29e95e06d2ca */
   public java.lang.String srcSysCode;
   /** @pdOid 7edb3792-2e78-48cf-942c-214feaac81be */
   public java.lang.String isprimary;
   /** id справочника причины отказа клиента или банка
    * 
    * @pdOid ee479f88-8aad-4c9d-a4f8-3e00b9c00c68 */
   public java.lang.String failurecauseid;
   /** ПИН уполномоченного лица
    * 
    * @pdOid c4bbeac4-bc75-4800-a9ff-0b0e5e511ccb */
   public java.lang.String pinuserid;
   /** ПИН клиента
    * 
    * @pdOid 53c06082-b76b-4689-8c6d-cffe934445cd */
   public java.lang.String pinclientid;
   /** Телефон уполномоченного лица
    * 
    * @pdOid 8175dbdb-4005-47f9-9509-c3c49b51903b */
   public java.lang.String phone;
   /** Идентификатор документа
    * 
    * @pdOid a09515e4-47a6-4a93-9172-fffd2d84ab2b */
   public java.lang.String docid;
   /** Номер документа
    * 
    * @pdOid eed5a401-71ce-4bf4-8646-a7340b96ab51 */
   public java.lang.String docnumber;
   /** Дата подключения продукта
    * 
    * @pdOid 104c9ed3-1841-460f-9d8f-77343999f76c */
   public java.util.Date startusingdate;
   /** Дата отключения продукта
    * 
    * @pdOid 1529dd73-b1f4-445c-a71f-a66db6dd736b */
   public java.util.Date stopusingdate;
   
   /** @pdRoleInfo migr=no name=ProductPartyRoleRel assc=prodPartyRoleRelPrd coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<ProductPartyRoleRel> productPartyRoleRel;
   /** @pdRoleInfo migr=no name=AcctProductRel assc=acctProdRelProd coll=java.util.Collection impl=java.util.HashSet mult=0..* */
//   public java.util.Collection< AcctProductRel > acctProductRel;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ProductPartyRoleRel> getProductPartyRoleRel() {
      if (productPartyRoleRel == null)
         productPartyRoleRel = new java.util.HashSet<ProductPartyRoleRel>();
      return productPartyRoleRel;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProductPartyRoleRel() {
      if (productPartyRoleRel == null)
         productPartyRoleRel = new java.util.HashSet<ProductPartyRoleRel>();
      return productPartyRoleRel.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProductPartyRoleRel */
   public void setProductPartyRoleRel(java.util.Collection<ProductPartyRoleRel> newProductPartyRoleRel) {
      removeAllProductPartyRoleRel();
      for (java.util.Iterator iter = newProductPartyRoleRel.iterator(); iter.hasNext();)
         addProductPartyRoleRel((ProductPartyRoleRel)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProductPartyRoleRel */
   public void addProductPartyRoleRel(ProductPartyRoleRel newProductPartyRoleRel) {
      if (newProductPartyRoleRel == null)
         return;
      if (this.productPartyRoleRel == null)
         this.productPartyRoleRel = new java.util.HashSet<ProductPartyRoleRel>();
      if (!this.productPartyRoleRel.contains(newProductPartyRoleRel))
      {
         this.productPartyRoleRel.add(newProductPartyRoleRel);
         newProductPartyRoleRel.setProduct(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldProductPartyRoleRel */
   public void removeProductPartyRoleRel(ProductPartyRoleRel oldProductPartyRoleRel) {
      if (oldProductPartyRoleRel == null)
         return;
      if (this.productPartyRoleRel != null)
         if (this.productPartyRoleRel.contains(oldProductPartyRoleRel))
         {
            this.productPartyRoleRel.remove(oldProductPartyRoleRel);
            oldProductPartyRoleRel.setProduct((Product)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProductPartyRoleRel() {
      if (productPartyRoleRel != null)
      {
         ProductPartyRoleRel oldProductPartyRoleRel;
         for (java.util.Iterator iter = getIteratorProductPartyRoleRel(); iter.hasNext();)
         {
            oldProductPartyRoleRel = (ProductPartyRoleRel)iter.next();
            iter.remove();
            oldProductPartyRoleRel.setProduct((Product)null);
         }
      }
   }

}