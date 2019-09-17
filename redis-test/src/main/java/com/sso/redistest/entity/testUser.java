package com.sso.redistest.entity;


import org.springframework.stereotype.Component;

@Component
public class testUser{
    // @Autowired
    // private RedisTemplate<String,User> redisTemplate;

    // @Override
    // public void redisTest() {
    //     // redis存储数据
    //     User user = new User();
    //     user.setUsername("yukong");
    //     user.setSex(18);
    //     user.setId(1L);
    //     String userKey = "yukong";
    //     redisTemplate.opsForValue().set(userKey, user);
    //     User newUser = (User) redisTemplate.opsForValue().get(userKey);
    //     System.out.println("获取缓存中key为" + userKey + "的值为：" + newUser);

    // }
}