/**
 * Created by TT on 23.05.2015.
 */
Ext.define('ActiveCrmApp.view.main.layout.client.SearchClientController', {
    requires: [


        'ActiveCrmApp.model.party.Party'
    ],
    extend: 'Ext.app.ViewController',
    alias: 'controller.searchclient',
    partyId: null,
    /**
     * Called when the view is created
     */
    init: function () {

    },

    onClientSelect: function (comboBox, record) {
        var partyView = this.getPartyView();
        var clientContactList = this.getClientContactList();
        //var clientToolbar = this.lookupReference( 'clientToolbar' );
        var me = this;
        ActiveCrmApp.model.party.Party.load(record.get('partyId'), {
            success: function (party) {
                me.partyId = party.id;
                me.activateClientMainInfoView();
                partyView.loadRecord(party);
                clientContactList.setData(party.get( 'fromPartyRoleRels' ));
                //var clientContactStore = clientContactList.getStore();
                //clientContactStore.loadData( party );
                //clientToolbar.show();
            }
        });
    },

    addClientMainInfo: function()
    {
        this.partyId = null;
        var partyForm = this.getPartyForm();
        var party = new ActiveCrmApp.model.party.Party();
/*
        party.id = 0;
*/
        partyForm.loadRecord( party );
        this.activateClientMainInfoForm();
    },

    editClientMainInfo: function ( button ) {
        if (this.partyId > 0) {
            //var cardPanel = this.lookupReference('clientmaininfopanel');
            var partyForm = this.getPartyForm();
            var me = this;
            //var clientToolbar = this.lookupReference( 'clientToolbar' );
            ActiveCrmApp.model.party.Party.load(this.partyId, {
                success: function (party) {
                    partyForm.loadRecord(party);
                    me.activateClientMainInfoForm();
                }
            });

        }
    },

    saveClient: function () {
        var me = this;
        var form = this.getPartyForm();
        //var cardPanel = this.lookupReference('clientmaininfopanel');
        var partyView = this.getPartyView();
        //var clientToolbar = this.lookupReference( 'clientToolbar' );
        if (form.isValid()) {
            var party = new ActiveCrmApp.model.party.Party(form.getValues());
            party.data.id = party.data.partyId;
            if (party.isValid()) {
                party.save({
                    success: function ( record ) {
                        partyView.loadRecord( record );
                        me.partyId = record.get( 'partyId' );
                        me.activateClientMainInfoView();
                    }
                });
            }
        }
    },

    activateClientMainInfoView: function () {
        var cardPanel = this.lookupReference('clientmaininfopanel');
        cardPanel.setActiveItem('clientmaininfoview');
        var clientToolbar = this.lookupReference('clientToolbar');
        clientToolbar.show();
    },

    activateClientMainInfoForm: function () {
        var cardPanel = this.lookupReference('clientmaininfopanel');
        cardPanel.setActiveItem('clientmaininfoform');
        var clientToolbar = this.lookupReference('clientToolbar');
        clientToolbar.hide();
    },

    getPartyForm: function()
    {
        return this.lookupReference('partyForm');
    },

    getPartyView: function()
    {
        return this.lookupReference('partyView');
    },
    getClientContactList: function()
    {
        return this.lookupReference('clientContactList');
    }


});