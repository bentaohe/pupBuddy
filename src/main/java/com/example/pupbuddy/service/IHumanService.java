package com.example.pupbuddy.service;

import com.example.pupbuddy.dto.Human;

import java.util.List;

public interface IHumanService {

    Human fetchById(int id);

    void delete(int id) throws Exception;

    Human save(Human human) throws Exception;

    List<Human> fetchAll();
}
