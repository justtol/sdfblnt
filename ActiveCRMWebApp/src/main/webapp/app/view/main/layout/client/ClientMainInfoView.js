Ext.define('ActiveCrmApp.view.main.layout.client.ClientMainInfoView', {
    requires: [
        'ActiveCrmApp.model.party.Party'
    ],

    extend: 'Ext.form.Panel',

    xtype: 'clientmaininfoview',
    reference: 'partyForm',

    viewModel: {
        //type: 'ActiveCrmApp.model.party.Party'

        /*data: {
            name: 'Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! ' +
            'Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! ' +
            'Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! Hello World! ',
            city: 'The html content',
            tin: 'A button',
            kpp: '',
            ogrn: ''
        }*/
    },


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