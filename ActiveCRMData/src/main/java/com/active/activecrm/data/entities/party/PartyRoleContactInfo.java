package com.active.activecrm.data.entities.party; /***********************************************************************
 * Module:  PartyRoleContactInfo.java
 * Author:  TT
 * Purpose: Defines the Class PartyRoleContactInfo
 ***********************************************************************/

import java.util.*;

/** контактнаЯ информациЯ (тел,email, факс...)
 * 
 * @pdOid fd0a2629-f538-4728-b4a0-5d96ba9310c3 */
public class PartyRoleContactInfo {
   /** pk общий длЯ всех Party
    * 
    * @pdOid fb05a769-ec45-44dc-8ed2-90a3cde37e09 */
   public java.lang.String pzinskey;
   /** @pdOid e50e69f2-4b44-4869-aea7-b928cf402dd5 */
   public java.lang.String pxinsname;
   /** Entity class
    * 
    * @pdOid 222d3099-b026-45c4-89d1-fb19c7a91f58 */
   public java.lang.String pxobjclass;
   /** @pdOid 151574e3-01c9-4254-876e-cfa16d75baf0 */
   public java.lang.String pylabel;
   /** @pdOid 67270b46-0765-4fdb-9d7c-67b027652024 */
   public java.util.Date pxcreatedatetime;
   /** @pdOid 95ab870b-87db-4beb-b4af-4d33c43dc55d */
   public java.lang.String pxcreateopname;
   /** @pdOid 8b526a6b-216e-4197-aed6-fdfa10db5fb4 */
   public java.lang.String pxcreateoperator;
   /** @pdOid e2c26fa3-6b87-4d7e-9279-8920c7129b73 */
   public java.lang.String pxcreatesystemid;
   /** @pdOid ac328fcc-b7a1-4fec-86d3-45ba164baf0f */
   public java.util.Date pxupdatedatetime;
   /** @pdOid 2a3c062f-cad1-490b-8351-ad8daa70d55c */
   public java.lang.String pxupdateopname;
   /** @pdOid 99da1b69-cf26-4e76-82d1-9e191544e02b */
   public java.lang.String pxupdateoperator;
   /** @pdOid 86fda5f2-673c-4a7c-93ae-4e9b90b26da8 */
   public java.lang.String pxupdatesystemid;
   /** @pdOid a10dbdb1-245e-4958-8961-5399fd72e07d */
   public java.lang.String pyrulesetname;
   /** @pdOid 7670d687-7bb3-47f6-9b29-990f5221a73d */
   public java.lang.String pzpvstream;
   /** id-к
    * 
    * @pdOid c041adc8-4470-48a8-a15d-a587e664a664 */
   public java.lang.String pyID;
   /** @pdOid 39303e6c-58ce-44eb-9f3c-97ecd9d49864 */
   public java.lang.String pyDescription;
   /** ссылка на party role rel
    * 
    * @pdOid d67d946f-5d82-49a2-81dd-017944547b50 */
   public java.lang.String partyRoleRelId;
   /** тип контактной инф (тел, email, fax)
    * 
    * @pdOid af3bc57f-ec31-4c2d-86b9-f467d0fce869 */
   public java.lang.String typeCode;
   /** значение
    * 
    * @pdOid 8b304d63-5c1e-4273-a333-ddf4d822d6c1 */
   public java.lang.String value;
   /** Код source system
    * 
    * @pdOid 0969d7b9-7b88-41e5-b59c-da0384324a46 */
   public java.lang.String srcSysCode;
   /** основнаЯ контакнтаЯ инф., т.е. из всех телефонов
    * 
    * @pdOid 6886a2fc-5fc6-4c61-9c0e-8871feed922a */
   public java.lang.String isPrimary;
   /** хранит последние 10 цифр тел.номера для поиска на равенство по номеру телефону
    * 
    * @pdOid 48508d43-3aaf-4fe6-8b24-19f252d1c8fc */
   public java.lang.String valuesearch;
   /** признак не корректных данных
    * 
    * @pdOid a7d4f905-94f2-4a7d-8427-d6aad1043ee0 */
   public java.lang.String isincorrect;

}