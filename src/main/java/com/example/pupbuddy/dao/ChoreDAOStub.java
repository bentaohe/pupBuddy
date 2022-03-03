package com.example.pupbuddy.dao;

import com.example.pupbuddy.dto.Chore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChoreDAOStub implements IChoreDAO{
    private Map<Integer, Chore> allChores = new HashMap<>();

    @Override
    public Chore save(Chore chore) throws Exception {
        Integer choreId = chore.getChoreId();
        allChores.put(choreId, chore);
        return chore;
    }

    @Override
    public List<Chore> fetchAll() {
        List<Chore> choreList = new ArrayList(allChores.values());
        return choreList;
    }

    @Override
    public Chore fetch(int id) {
        return allChores.get(id);
    }

    @Override
    public void delete(int id) {
        allChores.remove(id);
    }
}
