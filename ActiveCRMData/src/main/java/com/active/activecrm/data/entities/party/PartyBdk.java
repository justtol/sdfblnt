package com.active.activecrm.data.entities.party; /***********************************************************************
 * Module:  PartyBdk.java
 * Author:  TT
 * Purpose: Defines the Class PartyBdk
 ***********************************************************************/

import java.util.*;

/** БДК для Party
 * 
 * @pdOid 8b90ee56-e45a-47f6-98ca-95cd95eebcbc */
public class PartyBdk {
   /** @pdOid 0b966464-2a28-4134-8089-d6c7665e0440 */
   public java.lang.String pzinskey;
   /** @pdOid 23da8e87-3b31-4dff-8e70-489657dbd29a */
   public java.lang.String pxinsname;
   /** @pdOid b9a6ef71-521c-4c3b-bd43-eab6815f50a0 */
   public java.lang.String pxobjclass;
   /** @pdOid 3ad4961a-5909-410d-91fc-d9afd87e7412 */
   public java.lang.String pylabel;
   /** @pdOid 12e914ec-fac4-45d1-abfc-6354e5fe6eb1 */
   public java.util.Date pxcreatedatetime;
   /** @pdOid 4625df5f-dc27-4e5d-ac8f-0fb3614dc38b */
   public java.lang.String pxcreateopname;
   /** @pdOid a5d6d0de-f8eb-4fd4-9667-ea5fe6977ddb */
   public java.lang.String pxcreateoperator;
   /** @pdOid b5fec01b-59c6-4c93-8441-ba9a3e3fc60e */
   public java.lang.String pxcreatesystemid;
   /** @pdOid e4b71f97-89a2-402a-9b4c-303468480f4b */
   public java.util.Date pxupdatedatetime;
   /** @pdOid 15b31796-03a3-408a-9d24-3ec2369346b3 */
   public java.lang.String pxupdateopname;
   /** @pdOid 134186fe-e6a2-4e1e-a998-2b59ef30782a */
   public java.lang.String pxupdateoperator;
   /** @pdOid 5dfe1a8f-e64b-49f2-a889-fad210ae55a1 */
   public java.lang.String pxupdatesystemid;
   /** @pdOid b71f55ec-95c1-4e40-a5e6-db424dff864d */
   public java.lang.String pyrulesetname;
   /** @pdOid 49753f57-146f-496a-b643-e34c15997451 */
   public java.lang.String pzpvstream;
   /** id-к
    * 
    * @pdOid c17174a5-f550-44ec-9cad-3ca2a001f741 */
   public java.lang.String pyid;
   /** @pdOid c035f4f8-821f-4283-9f4b-04e8559e0a65 */
   public java.lang.String pydescription;
   /** Ссылка на pyID из Party, для которого внесены БДК
    * 
    * @pdOid d4580619-9b3f-4b15-a669-dde37d32b730 */
   public java.lang.String partyid;
   /** Дата внесения БДК
    * 
    * @pdOid cbe8c68f-feac-47d9-b677-a4851a0774a7 */
   public java.util.Date uploaddatetime;
   /** Количество счетов
    * 
    * @pdOid 6c866836-629e-4372-83b0-4c078396016d */
   public double numberofaccounts;
   /** Бух. режим расчетного счета
    * 
    * @pdOid 0585873a-6eac-4df1-9744-97e6f3909e08 */
   public java.lang.String accountingmodecode;
   /** Задолженность РКО
    * 
    * @pdOid 59789229-8fd7-4b7a-b51c-3500fd4f351a */
   public double rkodebt;
   /** Объем привлечения д/в (среднемесячный за год)
    * 
    * @pdOid 7da40eae-6f38-47f8-b043-d570d174238e */
   public double raisingfunds;
   /** Оборот по кредиту (среднемесячный за год)
    * 
    * @pdOid 5d571088-d5b1-45d1-b59c-60920b66aa12 */
   public double creditturnover;
   /** Комиссия РБ по клиенту (среднемесячная за год)
    * 
    * @pdOid 579cb325-5c57-40df-8322-585137e2a8f9 */
   public double commission;
   /** Комиссионный доход по инкассации (суммарный за год)
    * 
    * @pdOid 54fb3a80-633e-49b2-a115-6a7a5226886d */
   public double commissionincomecoll;
   /** Комиссионный доход по конвертации (суммарный за год)
    * 
    * @pdOid 2399ac3e-5c25-420e-9a63-f58bcdaa64b6 */
   public double commissionincomeconv;
   /** Комиссионный доход по валютному контролю (суммарный за год)
    * 
    * @pdOid 1b369452-6fdd-49e7-95a0-2289f17d0ce2 */
   public double commissionincomefxctrl;
   /** Объем срочного привлечения (среднемесячный за год)
    * 
    * @pdOid 45b0971f-b289-479c-a94b-3f42d5a06ed7 */
   public double urgentfundraising;

}