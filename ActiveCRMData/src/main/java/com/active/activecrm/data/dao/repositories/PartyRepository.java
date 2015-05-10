package com.active.activecrm.data.dao.repositories;

import com.active.activecrm.data.entities.party.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface PartyRepository extends CrudRepository<Party, Long>
{

}
