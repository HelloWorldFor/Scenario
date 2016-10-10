package com.ztesoft.bsn.zookeeper.demo.action;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ztesoft.bsn.cache.mongodb.model.User;
import com.ztesoft.bsn.cache.mongodb.service.UserService;
import com.ztesoft.bsn.dubbo.recharge.facade.QueryThread;

public class MongoDBQueryAction {

	static Logger logger = LoggerFactory.getLogger(MongoDBQueryAction.class);
	
	  
	
	public static void main(String[] args) {
		ExecutorService cachedThreadPool = Executors.newFixedThreadPool(300);
		 String[] fileUrl = new String[]{"classpath*:/config/spring-content.xml"};    
		 ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(fileUrl);  //初始化 applicationContext
		 UserService userService = applicationContext.getBean(UserService.class);
		 List<User> userList = userService.findUserList("un70");
		 System.out.println(userList.get(0).getUserName());
		 System.out.println(userList.get(0).getPwd());
	}

}
