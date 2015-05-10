package com.active.activecrm.mgmt.party;

import com.active.activecrm.data.entities.party.Party;

public interface PartyManagement
{
    public Party createParty( Party party  );

    public Party getParty( Long id );
}
