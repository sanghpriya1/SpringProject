package com.springproject.springboot.project.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

   @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloworld(){
       return "    Welcome to the SpringProject!  Wow" ;
   }
}
