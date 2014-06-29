Ext.define('manager.controller.Menu', {
			extend : 'Ext.app.Controller',
			stores : ['Menus'],
			models : ['Menu'],
			views : ['Menu'],
			init : function() {
				// TODO:Controller is no finish
				// 初始化部分，下面是部分是给菜单绑定单击事件，接下来会用，这里先注释
				this.control({
							'managerMenu' : {
								itemmousedown : this.loadMenu
							}
						});
			},
			loadMenu : function(selModel, record) {
				var main = Ext.getCmp("content-panel");
				if (record.get('leaf')) {
					if (record.get('optype') == true) {
						//wpanel, don't know the var
						var xtypepanel = Ext.getCmp(record.get('url'));
						if (!xtypepanel) {
							debugger;
							xtypepanel = Ext.widget(record.get('url'))
						}
						//don't work.
						main.setActiveTab(xtypepanel);
					} else {
						var panel = Ext.getCmp(record.get('id'));
						if (!panel) {
							panel = {
								/*
								 * here is for xtype, there is no xtype window,
								 * like subjectlist id:record.get('url'), title:
								 * record.get('text'), xtype:record.get('url'),
								 * closable: true
								 */
								title : 'New Tab ' + record.get('text'),
								iconCls : 'tabs',
								html : 'Tab Body ' + record.get('text')
										+ '<br/><br/>',
								closable : true
							};
							/* this.openTab(panel, record.get('url')); */
							this.openTab(panel, record.get('id'));
						} else {
							main.setActiveTab(panel);
						}
					}

				}
			},
			openTab : function(panel, id) {
				var o = (typeof panel == "string" ? panel : id || panel.id);
				var main = Ext.getCmp("content-panel");
				var tab = main.getComponent(o);
				if (tab) {
					main.setActiveTab(tab);
				} else if (typeof panel != "string") {
					panel.id = o;
					var p = main.add(panel);
					main.setActiveTab(p);
				}

			}

		});