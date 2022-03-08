package com.example.pupbuddy.service;

import com.example.pupbuddy.dto.Dog;

import java.util.List;

public interface IDogService {

    Dog fetchById(int id);

    void delete(int id) throws Exception;

    Dog save(Dog dog) throws Exception;

    List<Dog> fetchAll();
}
