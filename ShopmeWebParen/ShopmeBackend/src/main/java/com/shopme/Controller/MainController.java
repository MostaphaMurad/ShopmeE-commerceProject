package com.shopme.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Mostafa Murad
 * @created: 5/26/2023 on 5:41 PM
 **/
@Controller
public class MainController {
    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }
}
