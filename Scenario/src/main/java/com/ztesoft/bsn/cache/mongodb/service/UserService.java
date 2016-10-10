package com.ztesoft.bsn.cache.mongodb.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ztesoft.bsn.cache.mongodb.model.User;
import com.ztesoft.bsn.cache.mongodb.repository.UserRespository;

@Service("userService")
public class UserService{
	
	Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserRespository userRespository;
	public void saveList(){
		List<User> userList = new ArrayList<User>();
		User user = null;
		for(int i=100001;i<1000000;i++){
			user = new User();
			user.setUserName("un"+i);
			user.setPwd("pwd"+i);
			userList.add(user);
		}
		long startTime = System.currentTimeMillis();
		userRespository.save(userList);
		long endTime = System.currentTimeMillis();
		logger.info("单线程保存100w条数据耗时："+(endTime-startTime));
	}
	public List<User> findUserList(){
		List<User> userList = userRespository.findAll();
		return userList;
		
	}
	public List<User> findUserList(String userName){
		return userRespository.findByUserName(userName);
	}
	
	public void saveOne(){
		User user = new User();
		user.setUserName("lindong");
		user.setPwd("lindong");
		userRespository.save(user);
	}
}
