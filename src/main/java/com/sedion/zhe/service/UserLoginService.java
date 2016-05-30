package com.sedion.zhe.service;

import java.util.HashMap;


public interface UserLoginService {
	public HashMap<String, Object> login(String useraccound, String userpassword);
}
