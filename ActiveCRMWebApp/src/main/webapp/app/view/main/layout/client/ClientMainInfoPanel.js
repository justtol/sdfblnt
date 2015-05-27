Ext.define('ActiveCrmApp.view.main.layout.client.ClientMainInfoPanel', {
    requires: [
        'ActiveCrmApp.model.party.Party'
    ],

    extend: 'Ext.Container',

    xtype: 'clientmaininfopanel',

    dockedItems: [{
        dock: 'left',
        xtype: 'toolbar',
        items: [{
            iconCls: 'icon-edit',
            xtype: 'button'
        }]
    }],

    defaults: {
        xtype: 'displayfield',
        labelAlign: 'top'
    },
    items: [
        {
            fieldLabel: 'Наименование',
            name: 'name'
        },
        {
            fieldLabel: 'Город',
            name: 'city'
        },
        {
            fieldLabel: 'ИНН',
            name: 'tin'
        },
        {
            fieldLabel: 'КПП',
            name: 'kpp'
        },
        {
            fieldLabel: 'ОГРН',
            name: 'ogrn'
        },
        {
            xtype: 'fieldset',
            collapsible: true,
            title: 'Характеристики',
            collapsed: true,
            defaults: {
                xtype: 'displayfield',
                labelAlign: 'top'
            },
            items: [
                {
                    fieldLabel: 'ФОТ',
                    name: 'fot'
                }
            ]
        }
    ]


});