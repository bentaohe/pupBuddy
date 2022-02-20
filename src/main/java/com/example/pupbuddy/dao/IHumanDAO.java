package com.example.pupbuddy.dao;

import com.example.pupbuddy.dto.Human;

import java.util.List;

public interface IHumanDAO {
    Human save(Human human) throws Exception;

    List<Human> fetchAll();

    Human fetch(int id);

    void delete(int id);
}
