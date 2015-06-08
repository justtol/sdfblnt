package com.active.activecrm.data.dao.party;

import com.active.activecrm.data.entities.party.Party;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PartyRepository extends CrudRepository< Party, Long >
{

    @Query( "select p from Party p where ( lower(p.name) like ?1 or lower(p.officialName) like ?1 or p.tin like ?1 ) and p.isActive = true" )
    List< Party > findByNameOrTin( String nameOrTin, Pageable pageable );

    @Query( "select count(p) from Party p where ( lower(p.name) like ?1 or lower(p.officialName) like ?1 or p.tin like ?1 ) and p.isActive = true" )
    Integer findCountByNameOrTin( String nameOrTin );

    @Query( "select p from Party p left join fetch p.fromPartyRoleRels pr left join fetch pr.toParty tp left join fetch pr.partyRoleContactInfos con left join fetch con.contactInfoType where p.partyId = ?1" )
    Party loadPartyById( Long id );

}
