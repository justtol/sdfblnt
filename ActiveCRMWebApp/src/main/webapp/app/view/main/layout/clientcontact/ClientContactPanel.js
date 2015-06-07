Ext.define('ActiveCrmApp.view.main.layout.clientcontact.ClientContactPanel', {
    requires: [
        'ActiveCrmApp.view.main.layout.clientcontact.ClientContactList'
    ],

    extend: 'Ext.Container',

    //controller: 'searchclient',

    xtype: 'clientcontactpanel',

    items: [
        {
            xtype: 'clientcontactlist'
        }
    ]
});