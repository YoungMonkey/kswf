Ext.define("manager.view.Viewport", {
    extend: 'Ext.Viewport', 
    layout: 'fit', 
    hideBorders: true, 
    requires : [ 
        'manager.view.Header', 
        'manager.view.Menu', 
        'manager.view.TabPanel', 
        'manager.view.South' ,
        'manager.view.SubjectList'
    ], 
    initComponent : function(){ 
        var me = this; 
        Ext.apply(me, {                         //这里讲items加入当前类（即Viewport），其实直接配置Viewport的items效果一样
            items: [{ 
                id:'desk', 
                layout: 'border',   
                items: [ 
                    Ext.create('manager.view.Header'),      //创建上侧头
                    Ext.create('manager.view.Menu'),      //创建上侧头
                    Ext.create('manager.view.TabPanel'),        //创建上侧头
                    Ext.create('manager.view.South')        //创建上侧头
                ] 
            }] 
        }); 
        me.callParent(arguments); 
    } 
});