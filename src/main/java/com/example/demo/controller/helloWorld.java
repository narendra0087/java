package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class helloWorld {
	  
	 @RequestMapping("/hellow")
	 @ResponseBody
     public ResponseEntity<String> printHello(){
    	 return ResponseEntity.accepted().body("Hello Wolrd");
     }
}
