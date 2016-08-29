package com.ztesoft.bsn.cache.redis.entity;

import java.io.Serializable;
/**
 * 
 * @author Administrator
 *
 */
public class KeyAcctDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2093887583889386016L;
	
	private long keyAcctId;
	
	private long acctId;
	
	private String name;

	public long getKeyAcctId() {
		return keyAcctId;
	}

	public void setKeyAcctId(long keyAcctId) {
		this.keyAcctId = keyAcctId;
	}

	public long getAcctId() {
		return acctId;
	}

	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
