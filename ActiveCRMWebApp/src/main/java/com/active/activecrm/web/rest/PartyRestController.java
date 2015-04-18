package com.active.activecrm.web.rest;

import com.active.activecrm.data.entities.party.Party;
import com.active.activecrm.mgmt.party.PartyManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PartyRestController
{
    @Autowired
    private PartyManagement partyManagement;

    @RequestMapping( value = "/getParty", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public Party getParty( @RequestParam Long partyId )
    {
        return partyManagement.getParty( partyId );
    }

    @RequestMapping( value = "/createParty", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public Long getTasks( @RequestParam String name )
    {
        Party party = new Party();
        party.setName( name );
        partyManagement.createParty( party );
        return party.getId();
    }


}
