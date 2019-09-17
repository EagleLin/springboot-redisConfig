package com.sso.redistest.service;

import java.io.Serializable;

import com.sso.redistest.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class testService{
  
    private static final Logger log = LoggerFactory.getLogger(testService.class);
    @Autowired
	private RedisTemplate<String, Serializable> redisCacheTemplate;

    @RequestMapping("/index")
    public String redisTest() {
        // redis存储数据
      //  ExecutorService executorService = Executors.newFixedThreadPool(1000);
		redisCacheTemplate.opsForValue().set("User", new User(1L, "u1", "pa"));
		// TODO 对应 String（字符串）
		final User user = (User) redisCacheTemplate.opsForValue().get("User");
		log.info("[对象缓存结果] - [{}]", user);
        return "suc";
    }
}