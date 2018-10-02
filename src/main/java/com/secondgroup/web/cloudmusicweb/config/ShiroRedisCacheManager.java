package com.secondgroup.web.cloudmusicweb.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.util.Destroyable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;


@Component
public class ShiroRedisCacheManager implements CacheManager, Destroyable {
    private static Logger LOGGER = LogManager.getLogger(ShiroRedisCacheManager.class);

    private JedisConnectionFactory jedisConnectionFactory;

    public ShiroRedisCacheManager(JedisConnectionFactory jedisConnectionFactory) {
        this.jedisConnectionFactory = jedisConnectionFactory;
    }
  //private String cacheKeyPrefix = "shiro:";

  @Autowired
  private RedisTemplate<String, Object> redisTemplate;


    @Override
    public <K, V> org.apache.shiro.cache.Cache<K, V> getCache(String name) throws CacheException {
        LOGGER.debug("shiro redis cache manager get cache. name={} ", name);
        //return new ShiroRedisCache<K,V>(cacheKeyPrefix+name);
        return new ShiroRedisCache<>(name,jedisConnectionFactory);
    }

    @Override
    public void destroy() throws Exception {

    }
}
