package com.ztesoft.bsn.serviceabilitymgr.bll.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ztesoft.bsn.cache.redis.dal.KeyAcctRedis;
import com.ztesoft.bsn.cache.redis.entity.KeyAcctDto;

/**
 * 场景三启动类
 * @author Administrator
 *
 */
public class StartUp {

	public static void main(String[] args) {
		//加载spring配置及其配置的功能
        String[] fileUrl = new String[]{"classpath*:/config/spring-content.xml"};    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(fileUrl);  //初始化 applicationContext
        
        KeyAcctRedis keyAcctRedis = (KeyAcctRedis) applicationContext.getBean("keyAcctRedis");
        KeyAcctDto keyAcctDto = new KeyAcctDto();
        keyAcctDto.setAcctId(1006);
        keyAcctDto.setKeyAcctId(1006);
        keyAcctDto.setName("sss");
        KeyAcctDto keyAcctDto1 = new KeyAcctDto();
        keyAcctDto1.setAcctId(2006);
        keyAcctDto1.setKeyAcctId(2006);
        keyAcctDto1.setName("weijiali");
        System.out.println(keyAcctRedis.setKeyAcctDto(keyAcctDto));
        System.out.println(keyAcctRedis.setKeyAcctDto(keyAcctDto1));
        
        KeyAcctDto keyAcctTemp = keyAcctRedis.getKeyAcctDto(1006);
        
        System.out.println(keyAcctTemp.getName());
        System.out.println(keyAcctRedis.getKeyAcctDto(2006));
        KeyAcctDto keyAcctDto2 = new KeyAcctDto();
        keyAcctDto2.setAcctId(220526);
        keyAcctDto2.setName("林栋");
        keyAcctRedis.setKeyAcctDto(keyAcctDto2);
        
	}

}
