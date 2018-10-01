package com.secondgroup.web.cloudmusicweb.config;

import com.google.common.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.springframework.stereotype.Component;


@Component
public class ShiroRedisCacheManager implements CacheManager {

    @Override
    public <K, V> org.apache.shiro.cache.Cache<K, V> getCache(String s) throws CacheException {
        return null;
    }
}
