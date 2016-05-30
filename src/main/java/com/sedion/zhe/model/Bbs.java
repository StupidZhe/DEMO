package com.sedion.zhe.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

public class Bbs extends Model<Bbs>{
	public static final Bbs dao = new Bbs();
	public Page<Bbs> paginate(int pageNumber, int pageSize) {
		//return paginate(pageNumber, pageSize, "select *from bbs order by ID asc");
		return paginate(pageNumber, pageSize, "select *", "from bbs");
	}
}
