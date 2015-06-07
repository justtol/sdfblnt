Ext.define('ActiveCrmApp.view.main.layout.client.ClientMainInfoPanel', {
    requires: [
        'ActiveCrmApp.model.party.Party',
        'ActiveCrmApp.view.main.layout.client.ClientMainInfoView',
        'ActiveCrmApp.view.main.layout.client.ClientMainInfoForm',
        'ActiveCrmApp.view.main.layout.client.ClientMainInfoController',
        'Ext.button.Button',
        'Ext.toolbar.Toolbar',
        'Ext.layout.container.Card'
    ],

    extend: 'Ext.panel.Panel',

    //controller: 'clientmaininfo',

    xtype: 'clientmaininfopanel',
    reference: 'clientmaininfopanel',
    layout: 'card',

    dockedItems: [{
        dock: 'left',
        xtype: 'toolbar',
        reference: 'clientToolbar',
        items: [{
            iconCls: 'icon-edit',
            xtype: 'button',
            handler: 'editClientMainInfo'

        }]
    }],

    items: [
        {
            xtype: 'panel'
        },
        {
            id: 'clientmaininfoview',
            xtype: 'clientmaininfoview'
        },
        {
            id: 'clientmaininfoform',
            xtype: 'clientmaininfoform'
        }
    ]

});