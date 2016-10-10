package com.ztesoft.bsn.cache.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ztesoft.bsn.cache.mongodb.model.User;
/**
 * 
 * @ClassName: UserSetRespoistory 
 * @Description: user集合方法
 * @author lindong
 * @date 2016年10月8日 下午6:46:40 
 *
 */
public interface UserRespository extends MongoRepository<User, String> {
	
	public List<User> findByUserName(String userName);
}
