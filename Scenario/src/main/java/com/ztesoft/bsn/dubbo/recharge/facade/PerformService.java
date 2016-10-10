package com.ztesoft.bsn.dubbo.recharge.facade;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ztesoft.bsn.cache.mongodb.service.UserService;
@Component
public class PerformService {
	
	Logger logger = LoggerFactory.getLogger(PerformService.class);
	
	@Autowired UserService userService;
	
	public void  testUserService() {
		ExecutorService cachedThreadPool = Executors.newFixedThreadPool(300);
		QueryThread queryThead = null;
		long startTime = System.currentTimeMillis();
		for(int i=1;i<10000;i++){
			queryThead = new QueryThread("un"+i,userService);
			cachedThreadPool.execute(queryThead);
		}
		long endTime = System.currentTimeMillis();
		logger.info("总查询时间:"+(endTime-startTime));
		System.out.println("总查询时间:"+(endTime-startTime));
	}
	
	public static void main(String[] args) {
		String[] fileUrl = new String[]{"classpath*:/config/spring-content.xml"};    
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(fileUrl);  //初始化 applicationContext
		PerformService ps = applicationContext.getBean(PerformService.class);
		ps.testUserService();
	}
}
