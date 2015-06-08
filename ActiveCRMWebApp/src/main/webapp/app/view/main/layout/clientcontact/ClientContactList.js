Ext.define('ActiveCrmApp.view.main.layout.clientcontact.ClientContactList', {
    requires: [],

    extend: 'Ext.view.View',

    xtype: 'clientcontactlist',
    reference: 'clientContactList',
    store: Ext.data.StoreManager.lookup('clientcontacts'),
    tpl:  new Ext.XTemplate(
        '<tpl for=".">',
            '<div>{toParty.firstName} {toParty.secondName} {toParty.lastName}</div>',
            '<tpl for="partyRoleContactInfos">',
                '<div>{typeCode}: {value}</div>',
            '</tpl>',
        '</tpl>'
    ),
    itemSelector: 'div.thumb-wrap',
    emptyText: 'Нет контактной информации',
    deferEmptyText: false
});