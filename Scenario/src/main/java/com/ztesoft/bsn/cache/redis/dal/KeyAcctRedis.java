package com.ztesoft.bsn.cache.redis.dal;

import com.ztesoft.bsn.cache.redis.entity.KeyAcctDto;

public interface KeyAcctRedis {
	
	public KeyAcctDto getKeyAcctDto(long acctId);
	
	public long setKeyAcctDto(KeyAcctDto keyAcctDto);
	
	public void setKeyName(String key,String name);
	
}
