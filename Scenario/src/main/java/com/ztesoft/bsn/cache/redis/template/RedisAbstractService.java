package com.ztesoft.bsn.cache.redis.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public abstract class RedisAbstractService<K extends Object, V extends Object> {
	
	@Autowired
	public RedisTemplate<? extends Object,? extends Object> redisTemplate;
	
	
	
	
}
