package com.example;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.CommConfig;

@RestController
public class HelloRestController {

    @Resource
    private CommConfig commConfig;
    
    @RequestMapping("/qc")
	public CommConfig queryConfig() {
		return commConfig;
	}
}
