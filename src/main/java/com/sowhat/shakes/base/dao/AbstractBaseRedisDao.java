package com.sowhat.shakes.base.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * Created by liu on 2016/9/18.
 */
public abstract class AbstractBaseRedisDao<K,V> {
    @Autowired
    protected RedisTemplate<K,V> redisTemplate;

    public RedisSerializer<?> getKeyRedisSerializer() {
        return redisTemplate.getKeySerializer();
    }
    public RedisSerializer<?> getValueRedisSerializer() {
        return redisTemplate.getValueSerializer();
    }

    public void setRedisTemplate(RedisTemplate<K, V> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
