package com.active.activecrm.data.entities.products; /***********************************************************************
 * Module:  ProductDesc.java
 * Author:  TT
 * Purpose: Defines the Class ProductDesc
 ***********************************************************************/

import java.util.*;

/** справочник продуктов 
 * 
 * @pdOid 53775d4a-28ae-44d6-bbff-b2feda483a0d */
public class ProductDesc {
   /** id-к
    * 
    * @pdOid 17cb4e52-0320-4402-b239-1f79651f43f5 */
   public java.lang.String pyID;
   /** pk общий длЯ всех Party
    * 
    * @pdOid 588584b2-41dc-4958-ae84-919457b381cf */
   public java.lang.String pzinskey;
   /** @pdOid c947da75-8012-49ca-8b00-77e33d22fc63 */
   public java.lang.String pxinsname;
   /** Entity class
    * 
    * @pdOid db57104c-1fbe-4390-ba8a-4586529aa451 */
   public java.lang.String pxobjclass;
   /** @pdOid 07b62fb0-e49b-4c8f-a38d-9dd5554b086e */
   public java.lang.String pylabel;
   /** @pdOid a6f078c6-7176-4d68-a6d0-fecef0677c38 */
   public java.util.Date pxcreatedatetime;
   /** @pdOid 82ff74ec-2953-4810-8ecb-b07256a5b3ef */
   public java.lang.String pxcreateopname;
   /** @pdOid 81f68fdd-bc9a-424c-a2bd-c6bb718d857f */
   public java.lang.String pxcreateoperator;
   /** @pdOid f29fd791-9c89-4f49-abaf-81ced013d358 */
   public java.lang.String pxcreatesystemid;
   /** @pdOid 1fd0d3f6-b30c-4476-9160-08a7f5e38bc8 */
   public java.util.Date pxupdatedatetime;
   /** @pdOid e92070b6-1343-439e-b872-e740c99b030f */
   public java.lang.String pxupdateopname;
   /** @pdOid 8781a165-52fe-41e9-b918-7ca7bda4b6ba */
   public java.lang.String pxupdateoperator;
   /** @pdOid e1de63e0-6000-4b2c-a9bb-7a13d5063278 */
   public java.lang.String pxupdatesystemid;
   /** @pdOid bb47392a-7f4c-4bcf-a934-8484f72b7cc0 */
   public java.lang.String pyrulesetname;
   /** @pdOid c40a3045-7d63-4703-becb-691db0942f1f */
   public java.lang.String pzpvstream;
   /** код продукта
    * 
    * @pdOid a54a8400-ae21-44e2-a5fb-06d750757e96 */
   public java.lang.String code;
   /** код source system
    * 
    * @pdOid 5c8a9f3a-9ea9-4df1-9404-50d366f246db */
   public java.lang.String srcSysCode;
   /** Class длЯ работы с данным продуктом
    * 
    * @pdOid be20380c-7e74-4c11-943b-929ebed27dda */
   public java.lang.String workClass;
   /** max количество продаж длЯ продуктов
    * 
    * @pdOid 3d5c9271-397c-42ae-a3bc-8eea6fae6189 */
   public int maxSalesCount;
   /** отображать ли данные на UI
    * 
    * @pdOid 877f57d6-e992-485c-9282-64a76a2d3ece */
   public java.lang.String isHidden;
   /** Party котораЯ выпустила продукт
    * 
    * @pdOid 2fa8ef96-02f2-485d-b34c-5e5280625e7b */
   public java.lang.String issuerpartyid;
   /** Party роль Party котораЯ выпустила продукт
    * 
    * @pdOid 5e93e743-7552-4885-9832-732035eecbeb */
   public java.lang.String issuerpartyrolecode;
   /** Выполнять проверку статуса продукта независимо от наличия подключений
    * 
    * @pdOid be9a38ef-44b9-4692-bdc7-afcc9610c23d */
   public java.lang.String forcecheck;
   /** @pdOid b8bdfc1b-546d-42d1-ac79-de4019ab2b33 */
   public java.lang.String groupcode;
   /** Work-класс для экземпляров предложений по продукту
    * 
    * @pdOid 39615f0d-f8f4-487d-932c-6f16582fddbf */
   public java.lang.String opportunityclass;

}