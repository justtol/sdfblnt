package com.active.activecrm.data.entities.products; /***********************************************************************
 * Module:  ProductPartyRoleRel.java
 * Author:  TT
 * Purpose: Defines the Class ProductPartyRoleRel
 ***********************************************************************/

/** Связь продуктов с PartyRole
 * ( в том числе продукты конкурентов )
 * 
 * @pdOid 9a7f189a-44e4-4f3d-b699-ef6b78ce7fdb */
public class ProductPartyRoleRel {
   /** id-к
    * 
    * @pdOid 0201c4fb-637b-43b0-96cb-725604687c99 */
   public java.lang.String pyID;
   /** pk общий длЯ всех Party
    * 
    * @pdOid 533254ef-05cd-44d3-8259-3bed1707df27 */
   public java.lang.String pzinskey;
   /** @pdOid 81456a1e-546e-4e6f-9ead-6df35c5f2bff */
   public java.lang.String pxinsname;
   /** Entity class
    * 
    * @pdOid 42ce64e0-f7c0-4b02-bb2a-773efb150aca */
   public java.lang.String pxobjclass;
   /** @pdOid 90d5c921-c689-4b91-bd8e-015a1bf4d842 */
   public java.lang.String pylabel;
   /** @pdOid 71acc0f8-9dc1-4441-b25a-8263308cbd5c */
   public java.util.Date pxcreatedatetime;
   /** @pdOid ed74b6a2-8abf-4dcc-be9c-fb4475352155 */
   public java.lang.String pxcreateopname;
   /** @pdOid 3f90a3f1-0702-4d0e-a9e0-b5a8371fc1fb */
   public java.lang.String pxcreateoperator;
   /** @pdOid e9723ae9-adce-4f3b-a8a9-1d84141bd948 */
   public java.lang.String pxcreatesystemid;
   /** @pdOid c1bedf48-e889-449c-86ed-85cbb2f48b51 */
   public java.util.Date pxupdatedatetime;
   /** @pdOid 0b03c549-05f5-4401-a024-4f064a69bfe5 */
   public java.lang.String pxupdateopname;
   /** @pdOid fa0d6b5f-c6c4-463a-8828-c2054be10426 */
   public java.lang.String pxupdateoperator;
   /** @pdOid e7ca53c4-272f-4821-8d2a-023f379f66d4 */
   public java.lang.String pxupdatesystemid;
   /** @pdOid 493bfa1f-b966-4989-bac2-fc17800fa835 */
   public java.lang.String pyrulesetname;
   /** @pdOid 1025bcb7-3fdf-4481-bea0-77b5ec0ae030 */
   public java.lang.String pzpvstream;
   /** @pdOid ecdf10ac-70f5-4b90-bc54-c78b931c1349 */
   public java.lang.String partyId;
   /** Party Role code
    * 
    * @pdOid cabf3c18-a65e-49d3-bd26-2846732d7f80 */
   public java.lang.String roleCode;
   
   /** @pdRoleInfo migr=no name=Product assc=prodPartyRoleRelPrd mult=0..1 side=A */
   public Product product;
   
   
   /** @pdGenerated default parent getter */
   public Product getProduct() {
      return product;
   }
   
   /** @pdGenerated default parent setter
     * @param newProduct */
   public void setProduct(Product newProduct) {
      if (this.product == null || !this.product.equals(newProduct))
      {
         if (this.product != null)
         {
            Product oldProduct = this.product;
            this.product = null;
            oldProduct.removeProductPartyRoleRel(this);
         }
         if (newProduct != null)
         {
            this.product = newProduct;
            this.product.addProductPartyRoleRel(this);
         }
      }
   }

}