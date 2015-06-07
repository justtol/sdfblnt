/**
 * Created by TT on 03.06.2015.
 */
Ext.define('ActiveCrmApp.view.main.common.forms.citycombo.CityCombo', {
    requires: [
        'ActiveCrmApp.store.dicts.SearchCities',
        'ActiveCrmApp.view.main.common.forms.citycombo.CityComboController'
    ],
    extend: 'Ext.form.field.ComboBox',
    controller: 'citycombo',
    xtype: 'citycombobox',
    width: '100%',
    //displayField: 'name',
    tpl: Ext.create('Ext.XTemplate',
        '<ul class="x-list-plain"><tpl for=".">',
        '<li role="option" class="x-boundlist-item">' +
        '<h3>{name}</h3>' +
        '{regionCode}</li>',
        '</tpl></ul>'
    ),
    // template for the content inside text field
    displayTpl: Ext.create('Ext.XTemplate',
        '<tpl for=".">',
        '{name} ({regionCode})',
        '</tpl>'
    ),

    store: {
        type: 'search-cities'
    },
    listConfig: {
        loadingText: 'Поиск...',
        emptyText: 'Не найдено.' /*,
         itemSelector: '.search-item'*/

    },
    minChars: 3,
    queryParam: 'key',
    queryMode: 'remote',
    pageSize: 30

});