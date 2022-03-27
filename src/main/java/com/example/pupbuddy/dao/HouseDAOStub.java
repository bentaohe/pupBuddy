package com.example.pupbuddy.dao;

import com.example.pupbuddy.dto.House;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HouseDAOStub implements IHouseDAO{
    private Map<Integer, House> allHomes = new HashMap<>();

    @Override
    public House save(House house) throws Exception {
        Integer houseId = house.getHouseId();
        allHomes.put(houseId, house);
        return house;
    }

    @Override
    public List<House> fetchAll() {
        List<House> houseList = new ArrayList<House>(allHomes.values());
        return houseList;
    }

    @Override
    public House fetch(int id) {
        return allHomes.get(id);
    }

    @Override
    public void delete(int id) {
        allHomes.remove(id);
    }
}
