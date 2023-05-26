package com.shopme.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mostafa Murad
 * @created: 5/26/2023 on 5:25 PM
 **/
@RestController
@RequestMapping("/test")
public class Test {
    @GetMapping("")
    public String testApi(){
        return "OK";
    }
}
