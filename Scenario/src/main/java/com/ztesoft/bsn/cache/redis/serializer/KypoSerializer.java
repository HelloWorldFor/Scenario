package com.ztesoft.bsn.cache.redis.serializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.stereotype.Component;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

@Component
public class KypoSerializer<T> implements RedisSerializer<T> {

	@Autowired
	private Kryo kryo;
	
	@Override
	public byte[] serialize(T t) throws SerializationException {
		byte[] buffer = new byte[2048];  
        Output output = new Output(buffer);  
        kryo.writeClassAndObject(output, t);  
        return output.toBytes();  
	}

	@SuppressWarnings("unchecked")
	@Override
	public T deserialize(byte[] bytes) throws SerializationException {
		Input input = new Input(bytes);  
        T t = (T) kryo.readClassAndObject(input);
        return t; 
	}

}
