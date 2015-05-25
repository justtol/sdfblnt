/**
 * Created by TT on 23.05.2015.
 */
Ext.define('ActiveCrmApp.view.main.layout.client.SearchClientController', {
    requires: [

    ],
    extend: 'Ext.app.ViewController',
    alias: 'controller.searchclient',

    /**
     * Called when the view is created
     */
    init: function () {

    },

    onClientSelect: function (comboBox, record) {
        //Ext.MessageBox.alert( "Client select " + record.get( 'id' ) + " | " + record.get( 'name' ) );
        var partyForm = this.lookupReference('partyForm');
        ActiveCrmApp.model.party.Party.load(record.get('id'), { // load user with ID of "1"
            success: function (party) {
                partyForm.loadRecord(party); // when user is loaded successfully, load the data into the form
            }
        });
    }
});