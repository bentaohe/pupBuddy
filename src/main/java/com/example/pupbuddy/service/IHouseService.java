package com.example.pupbuddy.service;

import com.example.pupbuddy.dto.House;

import java.util.List;

public interface IHouseService {

    House fetchById(int id);

    void delete(int id) throws Exception;

    House save(House house) throws Exception;

    List<House> fetchAll();
}
