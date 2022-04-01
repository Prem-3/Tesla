package com.springboot.workers.jdbcexample.controller;



import java.sql.Date;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class HomeController {
@RequestMapping("/")
public String index() {

Date date = new Date(System.currentTimeMillis());
return "Hello visitor!\nVisiting time: "+date;
}
}