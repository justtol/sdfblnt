/**
 * Created by TT on 07.06.2015.
 */
Ext.define('ActiveCrmApp.model.party.PartyRoleRel', {
    extend: 'Ext.data.Model',

    fields: [
        {name: 'roleCode', type: 'string'},
        {name: 'positionCode', type: 'string'},
        {name: 'groupCode', type: 'string'},
        {name: 'isPrimary', type: 'boolean'},
        {name: 'fromPartyId', type: 'number', reference: 'Party'},
        {name: 'toPartyId', type: 'number', reference: 'Party'}
    ]

});