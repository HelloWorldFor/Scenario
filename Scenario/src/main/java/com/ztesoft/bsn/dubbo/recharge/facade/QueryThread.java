package com.ztesoft.bsn.dubbo.recharge.facade;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ztesoft.bsn.cache.mongodb.model.User;
import com.ztesoft.bsn.cache.mongodb.service.UserService;

public class QueryThread implements Runnable {
	
	Logger logger = LoggerFactory.getLogger(QueryThread.class);
	
	private String username;
	
	UserService userService;
	
	
	public QueryThread(String username,UserService userService){
		this.username = username;
		this.userService = userService;
	}

	@Override
	public void run(){
		long startTime = System.currentTimeMillis();
		List<User> userList = userService.findUserList(username);
		long endTime = System.currentTimeMillis();
		logger.info("每笔查询时间:"+(endTime-startTime));
		logger.info("userName.size:"+userList.size());
		System.out.println("每笔查询时间:"+(endTime-startTime));
		System.out.println("userName.size:"+userList.size());
	}

}
