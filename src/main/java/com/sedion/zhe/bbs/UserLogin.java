package com.sedion.zhe.bbs;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.sedion.zhe.model.User;
import com.sedion.zhe.service.UserLoginService;
import com.sedion.zhe.service.impl.UserLoginServiceImpl;
import com.sedion.zhe.validator.AccoundUpdateValidator;
public class UserLogin extends Controller {
	
	private UserLoginService userLoginService;
	
	public void index() {
		render("userlogin.ftl");
	}

	@Before(AccoundUpdateValidator.class)
	public void login() throws Exception {
		try {
			@SuppressWarnings("resource")
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
			userLoginService = applicationContext.getBean(UserLoginService.class);
			HashMap<String, Object> map = userLoginService.login(getPara("useraccound"), getPara("userpassword"));
			if (Integer.parseInt(map.get("res").toString()) == 100) {
				setSessionAttr("userID", ((User) map.get("user")).get("id"));
			}
			renderJson(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void heh() {
		System.out.println("qnmlgb");
	}
}
