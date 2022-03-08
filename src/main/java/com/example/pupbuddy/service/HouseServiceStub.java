package com.example.pupbuddy.service;

import com.example.pupbuddy.dao.IHouseDAO;
import com.example.pupbuddy.dto.House;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HouseServiceStub implements IHouseService{

    @Autowired
    private IHouseDAO houseDAO;

    public HouseServiceStub(){}

    public HouseServiceStub(IHouseDAO houseDAO){this.houseDAO = houseDAO;}

    @Override
    public House fetchById(int id) {
        House foundHouse = houseDAO.fetch(id);
        return foundHouse;
    }

    @Override
    public void delete(int id) throws Exception {
        houseDAO.delete(id);
    }

    @Override
    public House save(House house) throws Exception {
        return houseDAO.save(house);
    }

    @Override
    public List<House> fetchAll() {
        return houseDAO.fetchAll();
    }
}
