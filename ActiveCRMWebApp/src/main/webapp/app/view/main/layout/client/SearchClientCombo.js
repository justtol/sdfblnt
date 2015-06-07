/**
 * TODO there is a bug https://www.sencha.com/forum/showthread.php?291950
 * Paging toolbar cannot load the next page
 */
Ext.define('ActiveCrmApp.view.main.layout.client.SearchClientCombo', {
    requires: [
        'ActiveCrmApp.store.party.SearchParties',
        'Ext.layout.container.HBox'
    ],

    extend: 'Ext.panel.Panel',
    layout: 'hbox',
    align: 'stretch',
    xtype: 'searchclientcombo',
    width: '100%',
    items: [
        {
            xtype: 'combobox',
            width: '100%',
            //displayField: 'name',
            tpl: Ext.create('Ext.XTemplate',
                '<ul class="x-list-plain"><tpl for=".">',
                '<li role="option" class="x-boundlist-item">' +
                '<h3>{name}</h3>' +
                'ИНН: {tin}</li>',
                '</tpl></ul>'
            ),
            // template for the content inside text field
            displayTpl: Ext.create('Ext.XTemplate',
                '<tpl for=".">',
                '{name} (ИНН: {tin})',
                '</tpl>'
            ),

            store: {
                type: 'search-parties'
            },
            listConfig: {
                loadingText: 'Поиск...',
                emptyText: 'Не найдено.' /*,
                itemSelector: '.search-item'*/

            },
            minChars: 3,
            queryParam: 'key',
            queryMode: 'remote',
            pageSize: 30,
            listeners: {
                select: 'onClientSelect'
            },
            flex: 1
        },
        {
            margin: '0px 0px 0px 5px',
            iconCls: 'icon-add',
            xtype: 'button',
            handler: 'addClientMainInfo'
        }
    ]


});