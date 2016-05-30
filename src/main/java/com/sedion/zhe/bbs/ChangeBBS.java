package com.sedion.zhe.bbs;

import java.util.HashMap;
import java.util.Map;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.sedion.zhe.interceptor.UserInterceptor;
import com.sedion.zhe.model.Bbs;

@Before(UserInterceptor.class)
public class ChangeBBS extends Controller {

	public void index() {
		setSessionAttr("bbsID", getParaToInt(0, 0));
		Bbs bbs = Bbs.dao.findById(getParaToInt(0, 0));
		setAttr("bbs", bbs);
		render("changebbs.ftl");
	}

	public void save() {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("res", 100);
		try {
			Record bbs = Db.findById("bbs", getSessionAttr("bbsID")).set("USERBBS", getPara("textfield"))
					.set("bbstilte", getPara("usertitle"));
			Db.update("bbs", bbs);
		} catch (Exception e) {
			res.put("res", 0);
			e.printStackTrace();
		}
		renderJson(res);
	}
}
