package com.active.activecrm.mgmt.dicts;

import com.active.activecrm.data.PagedData;
import com.active.activecrm.data.entities.dicts.City;

public interface DictsManagement
{

    PagedData<City> searchCities( String key, Integer offset, Integer limit );
}
