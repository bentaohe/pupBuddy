package com.example.pupbuddy.dao;

import com.example.pupbuddy.dto.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DogDAOStub implements IDogDAO{
    private Map<Integer, Dog> allDogs = new HashMap<>();

    @Override
    public Dog save(Dog dog) throws Exception {
        Integer dogId = dog.getDogId();
        allDogs.put(dogId, dog);
        return dog;
    }

    @Override
    public List<Dog> fetchAll() {
        List<Dog> dogList = new ArrayList<>(allDogs.values());
        return dogList;
    }

    @Override
    public Dog fetch(int id) {
        return allDogs.get(id);
    }

    @Override
    public void delete(int id) {
        allDogs.remove(id);
    }
}
