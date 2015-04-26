package com.active.activecrm.data.entities.products;

import com.active.activecrm.data.entities.dicts.BaseDictionary;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/** справочник причин отказа клиента/банка от продажи продукта клиенту */
@Entity
@Table( name = "FAILURE_CAUSE" )
public class FailureCause extends BaseDictionary implements Serializable
{

}