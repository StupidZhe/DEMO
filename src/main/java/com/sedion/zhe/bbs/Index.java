
package com.sedion.zhe.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Record;
import com.sedion.zhe.interceptor.UserInterceptor;
import com.sedion.zhe.model.Bbs;
import com.sedion.zhe.model.User;

/**
 * 
 * @author Mr.W
 *
 */
public class Index extends Controller {

	private User user;

	@Autowired
	public void setUser(User user) {
		this.user = user;
		System.out.println("已注入User Index");
	}

	@Before(UserInterceptor.class)
	public void index() {
		System.out.println("hehehehhehe");
		user = new User();
		user = user.GetUserbyID(getSessionAttr("userID"));
		setAttr("user", user);
		setAttr("sessionID", getSession().getId());
		this.setAttr("bbsPage", Bbs.dao.paginate(getParaToInt(0, 1), 10));
		render("index.ftl");
	}

	public void logout() {
		getSession().invalidate();// 清空session
		redirect("/");
	}
}
