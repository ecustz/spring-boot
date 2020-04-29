package com.example.demo;

import java.util.Map;
import java.util.Set;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringRedisApplicationTests {
@Autowired
private RedisTemplate<String,Object> redisTemplate;
	
	@Test
	public void testRedis() {
		User user =new User("li",28);
		ListOperations<String, Object> listOperations = redisTemplate.opsForList();
		listOperations.rightPush("list1", user);
		listOperations.rightPushAll("list2", Arrays.asList(new String[] {"aa"}));
		User u1 = (User)listOperations.index("list1", 0);
		System.out.println("u1=="+u1);
		
		HashOperations<String, Object, Object> hashOperations = redisTemplate.opsForHash();
		hashOperations.put("hash1", "uu1", user);
		//hashOperations.delete(key, hashKeys);
		Map<Object, Object> map = hashOperations.entries("hash1");
		
		User uu1 = (User)hashOperations.get("hash1", "uu1");
		System.out.println("uu1=="+uu1);
		
		Set<String> keys = redisTemplate.keys("*");
		System.out.println("keys=="+keys);
		
		
		//System.out.println(redisTemplate.opsForList().size("list1"));
		//System.out.println(redisTemplate.opsForList().range("list1", 0, -1));
	}

}
