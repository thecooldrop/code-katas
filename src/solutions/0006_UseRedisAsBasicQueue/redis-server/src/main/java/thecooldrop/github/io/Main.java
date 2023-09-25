package thecooldrop.github.io;

import redis.clients.jedis.JedisPooled;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        var jedis = new JedisPooled("redis", 6379);
        while(true) {
            for(int i=0; i<5; i++) {
                jedis.lpush("queue", UUID.randomUUID().toString());
            }
        }
    }
}