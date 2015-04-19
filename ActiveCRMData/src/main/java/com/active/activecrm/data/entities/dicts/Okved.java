package com.active.activecrm.data.entities.dicts;

import com.active.activecrm.data.entities.dicts.BaseDictionary;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/** справочник классификаторов кодов видов деЯтельности */
@Entity
@Table( name = "OKVED" )
public class Okved extends BaseDictionary implements Serializable
{

}