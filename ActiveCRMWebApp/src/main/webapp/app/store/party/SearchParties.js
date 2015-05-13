/**
 * Created by U_M0PQL on 11.05.2015.
 */
Ext.define('ActiveCrmApp.store.party.SearchParties', {
    extend: 'Ext.data.Store',

    alias: 'store.search-parties',

    model: 'ActiveCrmApp.model.party.Party',

    storeId: 'search-parties',

    proxy: {
        type: 'rest',
        url: 'data/searchParties',
        reader: {
            type: 'json',
            rootProperty: 'data',
            totalProperty: 'totalCount'
        }
    }
});