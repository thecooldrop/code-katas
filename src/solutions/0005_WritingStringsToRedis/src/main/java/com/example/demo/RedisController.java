package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import redis.clients.jedis.JedisPooled;

@RestController
public class RedisController {
    
    @Autowired
    private JedisPooled jedis;

    @PostMapping(path="/{key}")
    ResponseEntity<Map.Entry<String,String>> write(@PathVariable(name="key") String key, @RequestBody String val)  {
        jedis.set(key, val);
        return ResponseEntity.ok(Map.entry(key, val));
    }

    @GetMapping(path="/")
    ResponseEntity<Map<String,String>> get() {
        var keys = jedis.keys("*");
        var map = new HashMap<String, String>();
        for(var key : keys) {
            map.put(key, jedis.get(key));
        }
        return ResponseEntity.ok(map);
    }

}
