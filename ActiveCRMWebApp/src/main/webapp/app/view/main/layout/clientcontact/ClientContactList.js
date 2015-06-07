Ext.define('ActiveCrmApp.view.main.layout.clientcontact.ClientContactList', {
    requires: [],

    extend: 'Ext.view.View',

    xtype: 'clientcontactlist',
    reference: 'clientContactList',
    store: Ext.data.StoreManager.lookup('clientcontacts'),
    tpl:  new Ext.XTemplate(
        '<tpl for=".">',
        '<span>{toParty.firstName} {toParty.secondName} {toParty.lastName}</span>',
        '</tpl>'
    ),
    itemSelector: 'div.thumb-wrap',
    emptyText: 'Нет контактной информации',
    deferEmptyText: false
});