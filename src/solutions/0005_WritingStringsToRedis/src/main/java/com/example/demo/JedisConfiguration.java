package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPooled;

@Configuration
public class JedisConfiguration {
    

    @Bean
    JedisPooled jedisPooled() {
        return new JedisPooled("redis", 6379);
    }

}
