package com.active.activecrm.data.dao.dicts;

import com.active.activecrm.data.entities.dicts.City;
import com.active.activecrm.data.entities.party.Party;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, String>
{
    @Query("select c from City c where ( lower(c.name) like ?1) and c.isActive = true order by c.sortOrder")
    List<City> findByName(String name, Pageable pageable);

    @Query("select count(c) from City c where ( lower(c.name) like ?1) and c.isActive = true")
    Integer findCountByName(String name);

}
