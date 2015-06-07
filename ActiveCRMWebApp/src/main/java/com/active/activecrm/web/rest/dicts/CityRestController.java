package com.active.activecrm.web.rest.dicts;

import com.active.activecrm.data.PagedData;
import com.active.activecrm.data.entities.dicts.City;
import com.active.activecrm.data.entities.party.Party;
import com.active.activecrm.mgmt.dicts.DictsManagement;
import com.active.activecrm.mgmt.party.PartyManagement;
import com.active.activecrm.utils.jpa.JpaUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/dicts/cities" )
public class CityRestController
{
    private static Log logger = LogFactory.getLog( CityRestController.class );

    @Autowired
    private DictsManagement dictsManagement;

/*
    @RequestMapping( value = "/getCity/{cityId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public Party getParty( @PathVariable( "cityId" ) Long cityId )
    {
        JpaUtils jpaUtils = new JpaUtils();
        try
        {
            return ( Party ) jpaUtils.cloneObjectAndDetach( dictsManagement.getParty( partyId ) );
        }
        catch ( IllegalAccessException | InstantiationException e )
        {
            logger.error( "", e );
            return null;
        }
    }

*/
    @RequestMapping( value = "/searchCities", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public PagedData< City > searchParties( @RequestParam String key, @RequestParam Integer start, @RequestParam Integer limit )
    {
        JpaUtils jpaUtils = new JpaUtils();
        try
        {
            PagedData< City > parties = dictsManagement.searchCities( key, start, limit );
            parties = ( PagedData< City > ) jpaUtils.cloneObjectAndDetach( parties );
            return parties;
        }
        catch ( IllegalAccessException | InstantiationException e )
        {
            logger.error( "", e );
            return null;
        }
    }

}
