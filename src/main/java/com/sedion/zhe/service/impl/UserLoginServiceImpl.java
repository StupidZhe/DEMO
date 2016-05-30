package com.sedion.zhe.service.impl;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.sedion.zhe.model.User;
import com.sedion.zhe.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	//
	// @Autowired
	// public void setUser(User user) {
	// this.user = user;
	// System.out.println("UserLoginService对象已注入user");
	// }
	public HashMap<String, Object> login(String useraccound, String userpassword) {
		HashMap<String, Object> map = new HashMap<String, Object>();

		User user = new User();
		try {
			user = user.GetUser(useraccound);
			if (null == user) {
				map.put("res", 59);
			} else if (!user.get("userpsw").equals(userpassword)) {
				map.put("res", 60);
			} else {
				map.put("res", 100);
				map.put("user", user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

}
