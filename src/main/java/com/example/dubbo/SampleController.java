package com.example.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ImportResource("classpath:config/dubbo.xml")
@Controller
//@EnableAutoConfiguration
@SpringBootApplication
public class SampleController {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello world";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}