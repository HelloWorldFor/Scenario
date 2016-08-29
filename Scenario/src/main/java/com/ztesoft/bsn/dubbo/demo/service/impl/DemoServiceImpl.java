package com.ztesoft.bsn.dubbo.demo.service.impl;

import com.ztesoft.bsn.dubbo.demo.service.DemoService;

/**
 * 
 * @author Administrator
 * 服务提供类实现方法
 *
 */
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "你好！"+name;
	}

}
