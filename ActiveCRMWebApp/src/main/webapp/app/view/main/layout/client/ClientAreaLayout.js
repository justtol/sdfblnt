/**
 * Created by U_M0PQL on 11.05.2015.
 */
Ext.define('ActiveCrmApp.view.main.layout.client.ClientAreaLayout', {
    requires: [
        'ActiveCrmApp.view.main.layout.client.SearchClientPanel'
    ],

    extend: 'Ext.panel.Panel',
    xtype: 'clientarea',
    items: [
        {
            xtype: 'searchclientpanel'
        }
    ]
});