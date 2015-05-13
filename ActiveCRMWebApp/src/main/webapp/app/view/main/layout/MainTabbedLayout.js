

Ext.define('ActiveCrmApp.view.main.layout.MainTabbedLayout', {
    requires: [
        'ActiveCrmApp.view.main.layout.client.ClientBorderLayout'
    ],

    extend: 'Ext.tab.Panel',
    xtype: 'framed-tabs',

    frame: true,
    defaults: {
        bodyPadding: 15
    },

    items: [{
        title: 'Клиенты',
        //glyph: 117,
        xtype: 'clientborderlayout'
    }, {
        title: 'Tasks',
        //glyph: 85,
        html: 'Tasks'
    }]
});