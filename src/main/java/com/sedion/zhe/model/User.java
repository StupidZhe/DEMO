package com.sedion.zhe.model;

import org.springframework.stereotype.Repository;

import com.jfinal.plugin.activerecord.Model;

@Repository
public class User extends Model<User>{
	public static final User dao = new User();

	public User GetUser(String useraccound) {
		User user = dao.findFirst("select * from test1 where useraccound = ?",
				useraccound);
		return user;
	}
	
	public User GetUserbyID(Object userID) {
		User user = dao.findById(userID);
		return user;
	}
	
}
