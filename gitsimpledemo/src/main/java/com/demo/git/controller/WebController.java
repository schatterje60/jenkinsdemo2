package com.demo.git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController 
{


		@RequestMapping("/hello")
		public String sayHello()
		{
			return "hello !!";
		}
		
		/*public String test()
		{
			return ("Test from local");
		}
		*/
	

}
