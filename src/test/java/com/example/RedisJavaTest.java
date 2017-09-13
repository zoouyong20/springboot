package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisJavaTest {

	@Test
	public void redisTest() {
		Jedis jedis = new Jedis("localhost");
		
	    System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        
        jedis.lpush("language", "java","C++","PHP","C#");
        
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("language", 0 ,-1);
        for(int i=0; i<list.size(); i++) {
            System.out.println("列表项为: "+list.get(i));
        }
        
        Map<String, String> hashRedis = new HashMap<>();
        hashRedis.put("java", "100");
        hashRedis.put("java", "101");
        hashRedis.put("PHP", "100");
        hashRedis.put("C++", "100");
        hashRedis.put("C#", "100");
        hashRedis.put(".Net", "100");
        jedis.hmset("score", hashRedis);
       
        List<String> list2=  jedis.hmget("score", "java");
        for(int i=0; i<list2.size(); i++) {
            System.out.println("列表项为: "+list2.get(i));
        }
        jedis.save();

        jedis.close();
	}
}
