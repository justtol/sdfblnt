package com.active.activecrm.data.entities.dicts; /**
 * ********************************************************************
 * Module:  ContactInfoType.java
 * Author:  TT
 * Purpose: Defines the Class ContactInfoType
 * *********************************************************************
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.*;

/** справочник типов контактной информациЯ (тел,email, факс...)
 */
@Entity
@Table( name = "CONTACT_INFO_TYPE" )
public class ContactInfoType extends BaseDictionary implements Serializable
{

}