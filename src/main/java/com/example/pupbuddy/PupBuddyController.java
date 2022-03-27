package com.example.pupbuddy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PupBuddyController
 * Comment to document what PupBuddyController does
 */

@Controller
public class PupBuddyController {

    /**
     * Handle the root (/) endpoint and return a start page.
     * @return the home page.
     */
    @RequestMapping("/")
    public String index(){
        return "start";
    }
}
