package com.ztesoft.bsn.serviceabilitymgr.bll.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScenarioStratApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fileUrl = new String[]{"classpath*:/config/spring-content.xml"};    
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(fileUrl); 
		applicationContext.start();
		synchronized (ScenarioStratApp.class) {
            while (true) {
                try {
                	ScenarioStratApp.class.wait();
                } catch (Throwable e) {
                }
            }
        }
	}

}
