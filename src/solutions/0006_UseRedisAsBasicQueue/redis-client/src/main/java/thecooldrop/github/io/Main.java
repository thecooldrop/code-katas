package thecooldrop.github.io;

import redis.clients.jedis.JedisPooled;

public class Main {
    public static void main(String[] args) {
        var jedis = new JedisPooled("redis", 6379);
        while(true) {
            var poped = jedis.blpop(5, "queue");
            for(var elem : poped) {
                System.out.println(poped);
            }
        }
    }
}