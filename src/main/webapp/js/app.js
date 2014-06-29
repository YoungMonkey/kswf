Ext.Loader.setConfig({
			enabled : true
		});
Ext.application({
			name : 'manager',
			appFolder : 'manager',
			controllers : ['Menu'],
			autoCreateViewport: true,
			launch : function() {
				/*
				 * Ext.create('Ext.container.Viewport', { layout: 'fit', items: [ {
				 * xtype: 'panel', title: 'Users', html : 'List of users will go
				 * here' } ] });
				 * 
				 */
			}

		});