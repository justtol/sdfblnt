Ext.define('ActiveCrmApp.view.main.layout.client.ClientMainInfoView', {
    requires: [
        'ActiveCrmApp.model.party.Party',
        'Ext.form.field.Hidden'
    ],

    extend: 'Ext.form.Panel',

    xtype: 'clientmaininfoview',
    reference: 'partyView',

    items: [
        {
            xtype: 'fieldset',
            collapsible: false,
            title: 'Основная информация',
            collapsed: false,
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
                }
            ]
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