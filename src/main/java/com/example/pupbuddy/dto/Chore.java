package com.example.pupbuddy.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Chore {
    private int choreId;
    private String choreName;
    private boolean choreComplete;
    private Date choreStart;
    private Date choreEnd;
    private String dogId;
    private String humanId;

}
