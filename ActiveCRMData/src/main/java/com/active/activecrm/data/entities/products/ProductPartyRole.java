package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.dicts.BaseDictionary;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * роли в которых выступают Party в отношениЯх с продуктом Product
 */
@Entity
@Table( name = "PRODUCT_PARTY_ROLE" )
public class ProductPartyRole extends BaseDictionary implements Serializable
{

}