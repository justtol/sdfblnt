/**
 * Created by U_M0PQL on 11.05.2015.
 */
Ext.define('ActiveCrmApp.model.party.Party', {
    requires: [
        /* include classes required by this component here */

        'Ext.data.reader.Json',
        'Ext.data.proxy.Rest'
    ],

    extend: 'Ext.data.Model',

    /*
    Uncomment to give this component an xtype
    xtype: 'party',
    */


    fields:[
        {name: 'id',  type: 'int'},
        {name: 'name',   type: 'string'},
        {name: 'tin', type: 'string'}
    ],

    proxy: {
        type: 'rest',
        api: {
            read: 'data/getParty',
            update: 'data/updateParty'
        },
        reader: {
            type: 'json',
            rootProperty: ''
        }
    }
});