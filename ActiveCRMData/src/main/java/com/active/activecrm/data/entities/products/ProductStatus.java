package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.dicts.BaseDictionary;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table( name = "PRODUCT_STATUS" )
public class ProductStatus extends BaseDictionary implements Serializable
{

}