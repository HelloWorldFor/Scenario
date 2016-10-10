package com.ztesoft.bsn.cache.mongodb.model;

import java.io.Serializable;
import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @ClassName: User 
 * @Description: mongodb集合文档对象 
 * @author lindong
 * @date 2016年10月8日 下午6:43:05 
 *
 */
@Document
public class User implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 8307373885292496740L;
	@Id
	private BigInteger id;
	
	private String userName;
	
	private String pwd;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
