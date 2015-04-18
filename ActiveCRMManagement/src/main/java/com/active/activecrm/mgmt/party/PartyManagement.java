package com.active.activecrm.mgmt.party;

import com.active.activecrm.data.entities.party.Party;

public interface PartyManagement
{
    public Long createParty( Party party  );

    public Party getParty( Long id );
}
