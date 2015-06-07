/**
 * Created by TT on 03.06.2015.
 */
Ext.define('ActiveCrmApp.model.dicts.City', {

    requires: [
        'Ext.data.proxy.Rest',
        'Ext.data.reader.Json'
    ],
    extend: 'Ext.data.Model',

    fields:[
        {name: 'code',  type: 'string'},
        {name: 'name',   type: 'string'},
        {name: 'type',   type: 'string'},
        {name: 'regionCode',   type: 'string'},
        {name: 'description', type: 'string'}
    ],
    idProperty: 'code',
    proxy: {
        type: 'rest',
        api: {
            read: 'data/dicts/cities/getCity'
        },
        reader: {
            type: 'json',
            rootProperty: ''
        }
    }

});