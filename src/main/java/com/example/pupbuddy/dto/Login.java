package com.example.pupbuddy.dto;

import com.fasterxml.jackson.annotation.JsonKey;
import lombok.Data;

public @Data
class Login {

    private int loginId;
    private String username;
    private String password;
    private int humanId;
}
