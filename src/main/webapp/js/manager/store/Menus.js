Ext.define('manager.store.Menus',{
    extend: 'Ext.data.TreeStore',
    requires: 'manager.model.Menu',
 	model: 'manager.model.Menu',
 	autoLoad: true,
 	proxy: {
        type: 'ajax',
        url: 'manager/data/manager.json',
        reader: {
            type: 'json',
            successProperty: 'success'
        }
    } 
});
