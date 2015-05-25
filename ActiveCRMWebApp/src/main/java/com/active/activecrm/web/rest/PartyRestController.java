package com.active.activecrm.web.rest;

import com.active.activecrm.data.PagedData;
import com.active.activecrm.data.entities.party.Party;
import com.active.activecrm.mgmt.party.PartyManagement;
import com.active.activecrm.utils.jpa.JpaUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PartyRestController
{

    private static Log logger = LogFactory.getLog( PartyRestController.class );

    @Autowired
    private PartyManagement partyManagement;

    @RequestMapping( value = "/getParty/{partyId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public Party getParty( @PathVariable( "partyId" ) Long partyId )
    {
        JpaUtils jpaUtils = new JpaUtils();
        try
        {
            return ( Party ) jpaUtils.cloneObjectAndDetach( partyManagement.getParty( partyId ) );
        }
        catch ( IllegalAccessException | InstantiationException e )
        {
            logger.error( "", e );
            return null;
        }
    }

    @RequestMapping( value = "/searchParties", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public PagedData< Party > searchParties( @RequestParam String key, @RequestParam Integer start, @RequestParam Integer limit )
//    public Map<String, Object> searchParties( @RequestParam String key )
    {
        JpaUtils jpaUtils = new JpaUtils();
        try
        {
            PagedData< Party > parties = partyManagement.searchParties( key, start, limit );
            parties = ( PagedData< Party > ) jpaUtils.cloneObjectAndDetach( parties );
//            Map<String, Object> map = new HashMap<>();
//            map.put( "data", parties );

//            return map;
            return parties;
        }
        catch ( IllegalAccessException | InstantiationException e )
        {
            logger.error( "", e );
            return null;
        }
    }

    @RequestMapping( value = "/createParty", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public Long getTasks( @RequestParam String name )
    {
        Party party = new Party();
        party.setName( name );
        party = partyManagement.createParty( party );
        return party.getId();
    }


}
