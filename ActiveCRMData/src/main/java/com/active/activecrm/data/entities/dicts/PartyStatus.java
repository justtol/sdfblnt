package com.active.activecrm.data.entities.dicts;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Статусы Party
 */
@Entity
@Table( name = "PARTY_STATUS" )
public class PartyStatus extends BaseDictionary implements Serializable
{

}