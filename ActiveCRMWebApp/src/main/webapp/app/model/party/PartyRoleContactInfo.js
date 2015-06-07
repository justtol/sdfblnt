/**
 * Created by TT on 07.06.2015.
 */
Ext.define('ActiveCrmApp.model.party.PartyRoleContactInfo', {
    extend: 'Ext.data.Model',

    fields: [
        {name: 'typeCode', type: 'string'},
        {name: 'value', type: 'string'},
        {name: 'isPrimary', type: 'boolean'},
        {name: 'isIncorrect', type: 'boolean'}
    ]

});