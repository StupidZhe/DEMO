package com.sedion.zhe.bbs.util;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.sedion.zhe.model.Bbs;
import com.sedion.zhe.model.User;

public class _MappingKit {
	public static void mapping(ActiveRecordPlugin arp) {
		System.out.println("hello mapping");
		arp.addMapping("bbs", Bbs.class);
		arp.addMapping("test1", User.class);

	}
	
}
