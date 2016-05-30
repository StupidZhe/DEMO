package com.sedion.zhe.bbs;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;
import com.sedion.zhe.interceptor.UserInterceptor;
import com.sedion.zhe.model.User;

@Before(UserInterceptor.class)
public class ChangeImg extends Controller {

	private User user;
	@Autowired
	public void setUser(User user) {
		this.user = user;
	}

	public void index() {
		User user = new User();
		user = this.user.GetUserbyID(getSessionAttr("userID"));
		setAttr("user", user);
		render("changeimg.ftl");
	}

	public void changeM() {
		try {
			UploadFile uploadFile = getFile("photo");
			String contentType = uploadFile.getContentType();
			if (contentType.contains("jpeg")) {
				File file = uploadFile.getFile();
				// 文件名称为年月日+nano时间+后缀
				Date date = new Date();
				String[] filenames = file.getName().split("\\.");
				DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
				String time = dateFormat.format(date);
				File newfile = new File("/Users/x72/Documents/workspace/bbs-demo/src/main/webapp/headimage/" + time
						+ System.nanoTime() + "." + filenames[filenames.length - 1]);
				file.renameTo(newfile);
				User user = new User();
				user = this.user.GetUserbyID(getSessionAttr("userID"));
				String oldname = user.get("userhead");

				user.set("userhead", "/bbs-demo/headimage/" + newfile.getName());
				user.update();// 保存更新

				File file2 = new File("/Users/x72/Documents/workspace/bbs-demo/src/main/webapp/headimage/" + oldname);
				if (file2.exists()) {
					file2.delete();
				}
				setAttr("user", user);
			} else {
				redirect("/changeimg");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		redirect("/changeimg");
	}
}
