/**
 * Created by TT on 28.05.2015.
 */
Ext.define('ActiveCrmApp.view.main.layout.client.ClientMainInfoController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.clientmaininfo',
    config: {
    },

    /**
     * Called when the view is created
     */
    init: function() {

    },


    enableClientMainInfoEditCard: function (button) {
        this.getView().getLayout().setActiveItem('clientmaininfoform');
        button.hide();
    }

});