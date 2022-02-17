package dto;

import lombok.Data;

@Data
public class Chore {
    private int ChoreId;
    private String choreName;
    private boolean choreComplete;
    private String choreStart;
    private String choreEnd;
    private String dogId;
    private String humanId;
}
