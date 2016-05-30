package com.sedion.zhe.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;

public class UserInterceptor implements Interceptor {

	public void intercept(Invocation inv) {
		System.out.println("开始拦截");
		Controller controller = inv.getController();
		if (null == controller.getSessionAttr("userID")) {
			controller.redirect("/");
		} else {
			inv.invoke();
		}

	}
}
