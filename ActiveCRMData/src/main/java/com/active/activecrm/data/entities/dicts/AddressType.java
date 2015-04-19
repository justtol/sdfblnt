package com.active.activecrm.data.entities.dicts;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/** справочник типов адресов */
@Entity
@Table( name = "ADDRESS_TYPE" )
public class AddressType extends BaseDictionary implements Serializable
{

}