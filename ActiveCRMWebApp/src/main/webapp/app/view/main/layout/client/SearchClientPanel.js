/**
 * Created by U_M0PQL on 11.05.2015.
 */
Ext.define('ActiveCrmApp.view.main.layout.client.SearchClientPanel', {
    requires: [
        'ActiveCrmApp.view.main.layout.client.SearchClientCombo',
        'ActiveCrmApp.view.main.layout.client.ClientMainInfoPanel',
        'ActiveCrmApp.view.main.layout.client.ClientMainInfoView',
        'ActiveCrmApp.view.main.layout.client.SearchClientController'
    ],

    extend: 'Ext.Container',



    xtype: 'searchclientpanel',

    items: [
        {
            xtype: 'searchclientcombo'
        },
        {
            xtype: 'clientmaininfopanel'
        }
    ]
});