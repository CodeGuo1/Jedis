package com.bjpowernode;

import redis.clients.jedis.Jedis;

public class FirstJedis {
    public static void main(String[] args) {
        //连接Redis
         Jedis jedis=new Jedis("10.211.55.7",6380);
         /*String ret =jedis.ping();
        System.out.println(ret);*/
        jedis.select(1);
        String ret =jedis.set("k111", "v111");
        System.out.println(ret);

    }
}
