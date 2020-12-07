package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class TranRedis {
    //连接Redis
    public static void main(String[] args) {
    Jedis jedis=new Jedis("10.211.55.7",6380);
    //开启事务
    Transaction transaction =jedis.multi();
    transaction.set("k2", "v2");
    transaction.set("k3", "v3");
    transaction.exec();

    }
}
