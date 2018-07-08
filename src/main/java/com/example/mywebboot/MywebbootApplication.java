package com.example.mywebboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MywebbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebbootApplication.class, args);
	}


	/**
	 * 秒杀借鉴的思路
	 * 		1.redis的方法封装
	 * 			1.2 redis设置值的时候需要统一化
	 * 	    2.最终状态码的固定
	 * 	    3.注解方式实现
	 * 	    4.登陆的2次md5的实现 ( password -->  A+N+passwords+B+C  -->  Md5(str)  ---> MD5(Md5(str),salt))
	 * 	    5.生成有序的长度的唯一ID SnowflakeId
*/




}
