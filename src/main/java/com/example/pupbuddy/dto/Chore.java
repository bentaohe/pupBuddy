package com.example.pupbuddy.dto;

import lombok.Data;

@Data
public class Chore {
    private int choreId;
    private String name;
    private boolean complete;
    private String start;
    private String end;
    private String dogId;
    private String humanId;
}
