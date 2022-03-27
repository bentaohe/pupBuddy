package com.example.pupbuddy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The controller for pupBuddy REST endpoints and web UI
 *
 * This class handles the CRUD operations for pupBuddy activities, via HTTP actions.
 *
 * This class also serves HTML based web pages, for UI interactions with activities.
 * @author
 */

@Controller
public class PupBuddyController {

    @RequestMapping("/")
    public String index(){
        return "start";
    }
}
