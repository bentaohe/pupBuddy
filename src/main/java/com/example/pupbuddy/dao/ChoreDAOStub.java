package com.example.pupbuddy.dao;

import com.example.pupbuddy.dto.Chore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChoreDAOStub implements IChoreDAO{
    private ArrayList<Chore> allChores = new ArrayList<>();

    @Override
    public Chore save(Chore chore) throws Exception {
        allChores.add(chore);
        return chore;
    }

    @Override
    public List<Chore> fetchAll() {
        return allChores;
    }

    @Override
    public Chore fetch(String id) {
        for (Chore chore : allChores) {
            if (chore.getChoreId().equals(id)) {
                return chore;
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        allChores.remove(id);
    }
}
