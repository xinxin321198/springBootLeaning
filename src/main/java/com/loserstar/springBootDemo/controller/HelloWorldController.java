/**
 * author: loserStar
 * date: 2017年7月26日下午4:26:20
 * email:362527240@qq.com
 * github:https://github.com/xinxin321198
 * remarks:
 */
package com.loserstar.springBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: loserStar
 * date: 2017年7月26日下午4:26:20
 * remarks:
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/index")
	public String index(){
		return "hello world";
	}
}
