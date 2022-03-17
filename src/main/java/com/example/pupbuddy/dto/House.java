package com.example.pupbuddy.dto;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class House {
    @DocumentId
    private int houseId;
    private Map<Integer, Human> humans = new HashMap<>();
    private Map<Integer, Dog> dogs = new HashMap<>();
    private Map<Integer, Chore> chores = new HashMap<>();
}
