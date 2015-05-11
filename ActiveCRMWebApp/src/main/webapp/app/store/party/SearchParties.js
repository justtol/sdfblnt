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
            type: 'array',
            rootProperty: 'data'
        }
    }
    /*
    Fields can also be declared without a model class:
    fields: [
        {name: 'firstName', type: 'string'},
        {name: 'lastName',  type: 'string'},
        {name: 'age',       type: 'int'},
        {name: 'eyeColor',  type: 'string'}
    ]
    */

    /*
    Uncomment to specify data inline
    data : [
        {firstName: 'Ed',    lastName: 'Spencer'},
        {firstName: 'Tommy', lastName: 'Maintz'},
        {firstName: 'Aaron', lastName: 'Conran'}
    ]
    */
});