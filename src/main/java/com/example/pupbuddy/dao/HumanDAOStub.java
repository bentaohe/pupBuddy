package com.example.pupbuddy.dao;

import com.example.pupbuddy.dto.Human;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanDAOStub implements IHumanDAO{
    private Map<Integer, Human> allHumans = new HashMap<>();

    @Override
    public Human save(Human human) throws Exception {
        Integer humanId = human.getHumanId();
        allHumans.put(humanId, human);
        return human;
    }

    @Override
    public List<Human> fetchAll() {
        List<Human> humanList = new ArrayList<>(allHumans.values());
        return humanList;
    }

    @Override
    public Human fetch(int id) {
        return allHumans.get(id);
    }

    @Override
    public void delete(int id) {
        allHumans.remove(id);
    }
}
