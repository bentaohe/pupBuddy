package com.example.pupbuddy.dto;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.Data;

public @Data class Chore {
    @DocumentId
    private int choreId;
    private String choreName;
    private boolean choreComplete;
    private String choreStart;
    private String choreEnd;
    private String dogId;
    private String humanId;

}
