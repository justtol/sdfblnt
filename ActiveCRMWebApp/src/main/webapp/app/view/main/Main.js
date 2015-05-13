/**
 * This class is the main view for the application. It is specified in app.js as the
 * "autoCreateViewport" property. That setting automatically applies the "viewport"
 * plugin to promote that instance of this class to the body element.
 * @deprecated
 * TODO - Replace this content of this view to suite the needs of your application.
 */
Ext.define('ActiveCrmApp.view.main.Main', {
    extend: 'ActiveCrmApp.view.main.layout.MainTabbedLayout',
    requires: [
        'ActiveCrmApp.view.main.MainController',
        'ActiveCrmApp.view.main.MainModel'/*,
        'Ext.layout.container.Border'*/
    ],

    xtype: 'app-main',
    
    controller: 'main',
    viewModel: {
        type: 'main'
    }

    /*layout: {
        type: 'border'
    },

    items: [{
        xtype: 'panel',
        region: 'west',
        html: '<ul><li>This area is commonly used for navigation, for example, using a "tree" component.</li></ul>',
        width: Ext.getBody().getViewSize().width/100*30,
        split: true
    },{
        region: 'center',
        xtype: 'tabpanel',
        width: Ext.getBody().getViewSize().width/100*40,
        split: true,
        items:[{
            title: 'Tab 1',
            html: '<h2>Content appropriate for the current navigation.</h2>'
        }]
    },{
        region: 'east',
        xtype: 'panel',
        width: Ext.getBody().getViewSize().width/100*30,
        split: true,
        items:[{
            title: 'Tab 1',
            html: '<h2>Content appropriate for the current navigation.</h2>'
        }]
    }]*/
});
