package com.sedion.zhe.validator;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class AccoundUpdateValidator extends Validator{

	@Override
	protected void validate(Controller c) {
		// TODO Auto-generated method stub
		validateRequiredString("useraccound", "userError", "请输入用户名");
		validateRequiredString("userpassword", "pswError", "密码不能为空");
	}

	@Override
	protected void handleError(Controller c) {	
		
	}

}
