package com.sedion.zhe.bbs;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.sedion.zhe.model.User;
import com.sedion.zhe.validator.UserRegisterValidator;

public class UserRegister extends Controller {

	private User user;
	@Autowired	
	public void setUser(User user) {
		this.user = user;
	}

	public void index() {
		render("userregister.ftl");
	}

	@Before(UserRegisterValidator.class)

	public void registerResult() {
		
		Map<String, Object> res = new HashMap<String, Object>();

		if (getPara("useraccound").trim().length() < 6) {
			res.put("res", 1);
			renderJson(res);

		} else if (getPara("userpsw").trim().length() < 6) {
			res.put("res", 2);
			renderJson(res);

		} else if (!getPara("userpsw").equals(getPara("verifyuserpsw"))) {
			res.put("res", 3);
			renderJson(res);

		} else {
			String userBirth = getPara("birthyear") + "/" + getPara("birthmonth") + "/" + getPara("birthday");
			Record add = new Record().set("useraccound", getPara("useraccound")).set("userpsw", getPara("userpsw"))
					.set("userbirth", userBirth).set("userpoint", "0").set("usersex", getPara("usersex"))
					.set("userin", 1).set("userhead", "/bbs-demo/headimage/de.jpg");
			Db.save("test1", add);
			user = user.GetUser(getPara("useraccound"));
			setSessionAttr("userID", user.get("id"));
			res.put("res", 5);
			renderJson(res);
		}
	}

	public void Captcha() {
		renderCaptcha();
	}

}
