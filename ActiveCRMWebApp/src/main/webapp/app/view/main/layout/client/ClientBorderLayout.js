/**
 * Created by U_M0PQL on 11.05.2015.
 */
Ext.define('ActiveCrmApp.view.main.layout.client.ClientBorderLayout', {
    requires: [
        'ActiveCrmApp.view.main.layout.client.SearchClientPanel',
        'Ext.layout.container.Border'
    ],

    extend: 'Ext.Container',

    xtype: 'clientborderlayout',


    layout: {
        type: 'border'
    },

    items: [{
        xtype: 'panel',
        region: 'west',
        html: '<ul><li>This area is commonly used for navigation, for example, using a "tree" component.</li></ul>',
        width: Ext.getBody().getViewSize().width / 100 * 30,
        split: true
    }, {
        region: 'center',
        xtype: 'panel',
        width: Ext.getBody().getViewSize().width / 100 * 40,
        split: true,
        bodyPadding: 5,
        items: [{
            xtype: 'searchclientpanel'
        }]
    }, {
        region: 'east',
        xtype: 'panel',
        width: Ext.getBody().getViewSize().width / 100 * 30,
        split: true,
        items: [{
            html: '<h2>Content appropriate for the current navigation.</h2>'
        }]
    }]
});