package com.ztesoft.bsn.zookeeper.demo.action;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ztesoft.bsn.cache.mongodb.model.User;
import com.ztesoft.bsn.cache.mongodb.service.UserService;

public class MongoDBDemo {

	
	public static void main(String[] args) {
		 String[] fileUrl = new String[]{"classpath*:/config/spring-content.xml"};    
		 ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(fileUrl);  //初始化 applicationContext
		 UserService userService = applicationContext.getBean(UserService.class);
		 userService.saveList();
		 List<User> userList = userService.findUserList();
		 System.out.println(userList.size());
//		 userService.saveOne();
	}
}
