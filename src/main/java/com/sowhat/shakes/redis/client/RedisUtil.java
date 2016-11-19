package com.sowhat.shakes.redis.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

/**
 * Created by liu on 2016/9/14.
 */
public class RedisUtil {

    private static Log log = LogFactory.getLog(RedisUtil.class);

    private static JedisPool jedisPool = null;

    private static Jedis jedis = null;

    /**
     * 初始化  jedisPool
     */
    static {
        try {
            //从配置文件中读取redis配置
            ResourceBundle bundle = ResourceBundle.getBundle("properties/redis");
            if (bundle == null){
                throw new IllegalArgumentException("[redis.properties] is not found!");
            }
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(Integer.valueOf(bundle.getString("redis.pool.maxActive")));
            config.setMaxIdle(Integer.valueOf(bundle.getString("redis.pool.maxIdle")));
            config.setMaxWaitMillis(Integer.valueOf(bundle.getString("redis.pool.maxWait")));
            config.setTestOnBorrow(Boolean.valueOf(bundle.getString("redis.pool.testOnBorrow")));
            config.setTestOnReturn(Boolean.valueOf(bundle.getString("redis.pool.testOnReturn")));
            jedisPool = new JedisPool(config,
                    bundle.getString("redis.host"),
                    Integer.valueOf(bundle.getString("redis.port")),
                    Integer.valueOf(bundle.getString("redis.pool.timeOut")),
                    bundle.getString("redis.auth"));
        }catch (Exception e ){
            log.error("初始化redis连接池出错",e);
        }

    }

    /**
     * 获取jedis
     * @return jedis
     */
    public synchronized static Jedis getJedis(){
        try{
            if(jedis == null){
                if(jedisPool != null){
                    jedis = jedisPool.getResource();
                }
            }
            return jedis;
        }catch (Exception e){
            log.error("获取jedis对象出错",e);
            return null;
        }

    }


    /**
     * 释放资源
     * @param jedis
     */
    public static void returnResource(final Jedis jedis){
        if (jedis != null){
            jedisPool.returnResource(jedis);
        }
    }

    //test
    public static void main(String[] agrs){
        System.out.println(RedisUtil.getJedis().get("age"));
    }
}
