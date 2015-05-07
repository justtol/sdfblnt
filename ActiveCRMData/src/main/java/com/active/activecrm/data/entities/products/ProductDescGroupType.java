package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.dicts.BaseDictionary;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * типы групп продуктов
 */
@Entity
@Table( name = "PRODUCT_DESC_GROUP_TYPE" )
public class ProductDescGroupType extends BaseDictionary implements Serializable
{

}