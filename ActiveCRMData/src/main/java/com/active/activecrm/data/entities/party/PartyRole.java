package com.active.activecrm.data.entities.party; /***********************************************************************
 * Module:  PartyRole.java
 * Author:  TT
 * Purpose: Defines the Class PartyRole
 ***********************************************************************/

import java.util.*;

/** роли в которых выступают Party
 * 
 * @pdOid 50007279-96ac-42cd-a8cc-b566e80c8cc9 */
public class PartyRole {
   /** pk общий длЯ всех Party
    * 
    * @pdOid 3575e9ff-7af5-49a4-8269-21210aa26a2f */
   public java.lang.String pzinskey;
   /** @pdOid 3d2ec4b6-c85d-41f4-aaac-b40656020f29 */
   public java.lang.String pxinsname;
   /** Entity class
    * 
    * @pdOid a59f1947-b35a-4a38-b0a3-3f07b08c5b8f */
   public java.lang.String pxobjclass;
   /** @pdOid a0691c20-912f-4e5c-b24f-766f53c8a395 */
   public java.lang.String pylabel;
   /** @pdOid adf06764-e424-41bb-b4ec-bef04568bf40 */
   public java.util.Date pxcreatedatetime;
   /** @pdOid 1514671b-30a1-4437-8724-204463c6b032 */
   public java.lang.String pxcreateopname;
   /** @pdOid 5dae38b2-6067-4fe1-ab5a-85233e6260a8 */
   public java.lang.String pxcreateoperator;
   /** @pdOid 83869805-e973-4832-b901-6a522612fc20 */
   public java.lang.String pxcreatesystemid;
   /** @pdOid 169286c6-b3f7-447b-82ea-c31577df9b68 */
   public java.util.Date pxupdatedatetime;
   /** @pdOid 7a293e0a-5c65-49d1-939e-bff2165e3b04 */
   public java.lang.String pxupdateopname;
   /** @pdOid f7dd6291-2961-4c20-840d-2ed93b0643ce */
   public java.lang.String pxupdateoperator;
   /** @pdOid 6ad0b4e0-6e1d-4940-8702-c7fe343d9521 */
   public java.lang.String pxupdatesystemid;
   /** @pdOid 14df1ca6-dd77-4ef0-8a47-a12de6a26d11 */
   public java.lang.String pyrulesetname;
   /** @pdOid 2b4cd09d-df49-407a-9dad-7f757cd79693 */
   public java.lang.String pzpvstream;
   /** id-к
    * 
    * @pdOid e3d2f3fe-20dd-41ea-8a19-5ba807ac3a51 */
   public java.lang.String pyID;
   /** тип свЯзи между Party
    * 
    * @pdOid 7a4de201-4c96-43be-a885-0e4f3a626589 */
   public java.lang.String code;
   /** @pdOid 2baa61a5-12fa-4967-933f-f05281a720ab */
   public java.lang.String name;
   /** Описание
    * 
    * @pdOid 366896ab-3ad4-49d7-a862-48481f6df800 */
   public java.lang.String pyDescription;
   /** код source system: длЯ ролей из других систем выставлЯем префиксом в коде роли ,например: ALBO_OPERATOR
    * 
    * @pdOid 8b5da9f2-75d7-40e0-a34c-dcc7f6c6f5da */
   public java.lang.String srcSysCode;
   /** код группы: 
    * 
    * @pdOid 5e372691-c314-4e30-9081-117307144c22 */
   public java.lang.String groupCode;
   /** нельзЯ редактировать вручную только после предоставлениЯ новых документов
    * 
    * @pdOid 7f299285-d346-442e-a9ad-5768d6422454 */
   public java.lang.String isLocked;

}