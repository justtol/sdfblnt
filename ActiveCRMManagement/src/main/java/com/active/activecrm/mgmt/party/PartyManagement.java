package com.active.activecrm.mgmt.party;

import com.active.activecrm.data.PagedData;
import com.active.activecrm.data.entities.party.Party;

import java.util.List;

public interface PartyManagement
{
    Party createParty( Party party  );

    Party getParty( Long id );

    PagedData<Party> searchParties( String key, Integer offset, Integer limit );
}
