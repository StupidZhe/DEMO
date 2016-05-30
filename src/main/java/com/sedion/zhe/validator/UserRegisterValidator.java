package com.sedion.zhe.validator;

import java.util.HashMap;
import java.util.Map;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class UserRegisterValidator extends Validator{

	@Override
	protected void validate(Controller c) {
		// TODO Auto-generated method stub
		validateCaptcha("safecode", "Error", "验证码不正确");
	}

	@Override
	protected void handleError(Controller c) {
		// TODO Auto-generated method stub
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("res", 4);
		c.renderJson(res);
	}

}
