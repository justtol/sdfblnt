/**
 * Created by TT on 03.06.2015.
 */
Ext.define('ActiveCrmApp.store.dicts.SearchCities', {
    extend: 'Ext.data.Store',

    alias: 'store.search-cities',

    model: 'ActiveCrmApp.model.dicts.City',

    storeId: 'search-cities',

    proxy: {
        type: 'rest',
        url: 'data/dicts/cities/searchCities',
        reader: {
            type: 'json',
            rootProperty: 'data',
            totalProperty: 'totalCount'
        }
    }
});