package com.sedion.zhe.bbs;

import org.springframework.beans.factory.annotation.Autowired;

import com.jfinal.core.Controller;
import com.sedion.zhe.service.UserLoginService;

public class CommonController extends Controller{

	@Autowired
	UserLoginService userLoginService;
	
}
