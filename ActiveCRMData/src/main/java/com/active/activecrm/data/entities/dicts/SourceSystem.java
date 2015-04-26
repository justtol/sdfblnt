package com.active.activecrm.data.entities.dicts;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * справочник систем
 */
@Entity
@Table( name = "SOURCE_SYSTEM" )
public class SourceSystem extends BaseDictionary implements Serializable
{

}