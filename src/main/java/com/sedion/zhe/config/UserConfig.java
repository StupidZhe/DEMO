package com.sedion.zhe.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.render.ViewType;
import com.sedion.zhe.bbs.ChangeBBS;
import com.sedion.zhe.bbs.ChangeImg;
import com.sedion.zhe.bbs.Index;
import com.sedion.zhe.bbs.UserLogin;
import com.sedion.zhe.bbs.UserRegister;
import com.sedion.zhe.bbs.util._MappingKit;
import com.sedion.zhe.model.Bbs;
import com.sedion.zhe.model.User;

public class UserConfig extends JFinalConfig {
	@Override
	public void configConstant(Constants me) {
		//me.setDevMode(true);
		me.setEncoding("utf-8");
		me.setViewType(ViewType.FREE_MARKER);// important
		me.setBaseUploadPath("/Users/x72/Documents/tomcatw/WTF/headimage/");
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/", UserLogin.class,"/web/PC");
		me.add("/index", Index.class, "/web/PC");
		me.add("/userregister", UserRegister.class, "/web/PC");
		me.add("/changeimg", ChangeImg.class, "/web/PC");
		me.add("/changebbs", ChangeBBS.class,"/web/PC");
	}

	@Override
	public void configPlugin(Plugins me) {
		com.jfinal.plugin.druid.DruidPlugin c3p0Plugin = 
				new com.jfinal.plugin.druid.DruidPlugin(
				"jdbc:mysql://127.0.0.1:3306/webdb", "root", "ifimbest123s");
		me.add(c3p0Plugin);
		// 配置ActiveRecord插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		me.add(arp);
		//arp.setShowSql(true); //获取sql信息

		// 所有配置在 MappingKit 中搞定
		_MappingKit.mapping(arp);
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub

	}
	
    @Autowired
    public void setApplicationContext(ApplicationContext ctx) {
        System.out.println("...........................");
        System.out.println("fgrthhyntyn");
    }

}
