package com.example.pupbuddy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PupBuddyController {

    @RequestMapping("/")
    public String index(){
        return "start";
    }
}
