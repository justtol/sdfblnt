package com.active.activecrm.data.entities.dicts;
import com.active.activecrm.data.entities.BaseEntity;
import com.active.activecrm.data.entities.dicts.BaseDictionary;
import com.active.activecrm.data.entities.party.PartyRoleRel;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/** роли в которых выступают Party */
@Entity
@Table( name = "PARTY_ROLE" )
public class PartyRole extends BaseDictionary implements Serializable
{

   /** нельзЯ редактировать вручную только после предоставлениЯ новых документов */
   @Column( name = "IS_LOCKED" )
   public Boolean isLocked;

   @OneToMany( fetch = FetchType.LAZY, mappedBy = "partyRole" )
   private Set<PartyRoleRel > partyRoleRels = new HashSet<>();

   public Boolean isLocked()
   {
      return isLocked;
   }

   public void setIsLocked( Boolean isLocked )
   {
      this.isLocked = isLocked;
   }

   public Set< PartyRoleRel > getPartyRoleRels()
   {
      return partyRoleRels;
   }

   public void setPartyRoleRels( Set< PartyRoleRel > partyRoleRels )
   {
      this.partyRoleRels = partyRoleRels;
   }
}