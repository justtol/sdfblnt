/**
 * Created by TT on 07.06.2015.
 */
Ext.define('ActiveCrmApp.store.party.ClientContacts', {
    extend: 'Ext.data.Store',
    alias: 'store.clientcontacts',

    requires: [
        'ActiveCrmApp.model.party.PartyRoleRel'
    ],
    storeId: 'clientcontacts',
    model: 'ActiveCrmApp.model.party.PartyRoleRel'
    //autoLoad: true,
    //data: []
});