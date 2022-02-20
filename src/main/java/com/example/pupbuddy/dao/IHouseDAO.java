package com.example.pupbuddy.dao;

import com.example.pupbuddy.dto.House;

import java.util.List;

public interface IHouseDAO {
    House save(House house) throws Exception;

    List<House> fetchAll();

    House fetch(int id);

    void delete(int id);
}
