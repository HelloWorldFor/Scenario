package com.ztesoft.bsn.cache.redis.dal.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.ztesoft.bsn.cache.redis.dal.KeyAcctRedis;
import com.ztesoft.bsn.cache.redis.entity.KeyAcctDto;

@Repository("keyAcctRedis")
public class KeyAcctRedisImpl<K extends Object, V extends Object> implements
		KeyAcctRedis {

	@Autowired
	public RedisTemplate<String, Object> redisTemplate;
	
	

	@Override
	public long setKeyAcctDto(KeyAcctDto keyAcctDto) {
		// TODO Auto-generated method stub
//		BoundListOperations<String, Object> keyAcct = this.redisTemplate.boundListOps("keyAcct:"+keyAcctDto.getAcctId());
		return redisTemplate.opsForList().leftPush("keyAcct:"+keyAcctDto.getAcctId(), keyAcctDto);
//		return keyAcct.leftPush(keyAcctDto);
	}

	@Override
	public KeyAcctDto getKeyAcctDto(long acctId) {
		
		return (KeyAcctDto) redisTemplate.opsForList().range("keyAcct:"+acctId, 0, -1).get(0);
		
	}
	@Override
	public void setKeyName(String key,String name){
		redisTemplate.opsForValue().set(key, name);
	}

}
