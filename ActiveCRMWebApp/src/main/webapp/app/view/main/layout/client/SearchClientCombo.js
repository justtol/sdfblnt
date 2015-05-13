/**
 * Created by U_M0PQL on 11.05.2015.
 */
Ext.define('ActiveCrmApp.view.main.layout.client.SearchClientCombo', {
    requires: [
        'ActiveCrmApp.store.party.SearchParties'
    ],

    extend: 'Ext.panel.Panel',
    layout: 'anchor',


    xtype: 'searchclientcombo',



    items: [
        {
            xtype: 'combo',
            //reference: 'parties',
           // publishes: 'partiescombobox',
            fieldLabel: 'Искать клиента',
            displayField: 'name',
            /*displayTpl: ['<h3>{name}</h3>',
                '{id}'],*/
            //anchor: '-15',
            store: {
                type: 'search-parties'
            },
            listConfig: {
                loadingText: 'Searching...',
                emptyText: 'No matching posts found.',

                itemSelector: '.search-item',

                // Custom rendering template for each item
                itemTpl: ['<h3>{name}</h3>',
                    '{id}']
            },
            // We're forcing the query to run every time by setting minChars to 0
            // (default is 4)
            minChars: 3,
            queryParam: 'key',
            queryMode: 'remote'
        }
    ]
});