package com.example.pupbuddy.dao;

import com.example.pupbuddy.dto.House;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IHouseDAO {
    House save(House house) throws Exception;

    List<House> fetchAll();

    House fetch(String id);

    void delete(String id);
}
