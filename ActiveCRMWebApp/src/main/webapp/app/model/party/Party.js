/**
 * Created by U_M0PQL on 11.05.2015.
 */
Ext.define('ActiveCrmApp.model.party.Party', {
    requires: [
        /* include classes required by this component here */

        'Ext.data.reader.Json',
        'Ext.data.proxy.Rest',
        'Ext.data.writer.Json'
    ],

    extend: 'Ext.data.Model',

    /*
     Uncomment to give this component an xtype
     xtype: 'party',
     */


    fields: [
        {name: 'partyId', type: 'integer'},
        {name: 'name', type: 'string'},
        {name: 'tin', type: 'string'},
        {name: 'firstName', type: 'string'},
        {name: 'secondName', type: 'string'},
        {name: 'lastName', type: 'string'}

    ],

    proxy: {
        type: 'rest',
        url: 'data/updateParty',
        api: {
            read: 'data/getParty',
            update: 'data/updateParty'
        },
        reader: {
            type: 'json',
            rootProperty: ''
        },
        writer: {
            type: 'json',
            rootProperty: '',
            writeAllFields: 'true'
        }
    }
});