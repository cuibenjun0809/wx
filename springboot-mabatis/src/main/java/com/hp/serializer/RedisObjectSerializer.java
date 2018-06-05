package com.hp.serializer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * 实现对象的序列化接口
 * @author ck
 * @date 2018年5月22日 下午2:52:35
 */
public class RedisObjectSerializer implements RedisSerializer<Object>{

	
	private Converter<Object, byte[]> serializer = new SerializingConverter();
	private Converter<byte[], Object> deserializer = new DeserializingConverter();
	static final byte[] EMPTY_ARRAY = new byte[0];
	@Override
	public Object deserialize(byte[] data) throws SerializationException {
		if(isEmpty(data)){
			return null;
		}
		return deserializer.convert(data);
	}

	@Override
	public byte[] serialize(Object object) throws SerializationException {
		if(object == null){
			return EMPTY_ARRAY;
		}	
		return serializer.convert(object);
	}
	
	private boolean isEmpty(byte[] data){
		return (data == null || data.length == 0);
	}
}
