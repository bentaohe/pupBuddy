package com.example.pupbuddy;

import com.example.pupbuddy.dto.*;
import com.example.pupbuddy.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * PupBuddyController
 * Comment to document what PupBuddyController does
 */

@Controller
public class PupBuddyController {

    @Autowired
    IChoreService choreService;

    @Autowired
    IHumanService humanService;

    @Autowired
    IDogService dogService;

    @Autowired
    IHouseService houseService;

    @Autowired
    ILoginService loginService;

    @RequestMapping("/")
    public String index(){
        return "login";
    }

    @PostMapping(value="/login", consumes="application/json", produces="application/json")
    public String login(){
        return "home";
    }

    @PostMapping(value="/signup", consumes="application/json", produces="application/json")
    public String signup(@RequestBody Login login){
        Login createdLogin = new Login();
        createdLogin.setUsername(login.getUsername());
        createdLogin.setPassword(login.getPassword());
        try {
            loginService.save(createdLogin);
            return "home";
        } catch (Exception e) {
            return "error";
        }
    }



}
