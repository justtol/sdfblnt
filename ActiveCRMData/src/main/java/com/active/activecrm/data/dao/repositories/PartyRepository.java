package com.active.activecrm.data.dao.repositories;

import com.active.activecrm.data.entities.party.Party;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PartyRepository extends CrudRepository<Party, Long>
{
    @Query("select p from Party p where ( lower(p.name) like ?1 or lower(p.officialName) like ?1 or p.tin like ?1 ) and p.isActive = true")
    List<Party> findByNameOrTin(String nameOrTin);
}
