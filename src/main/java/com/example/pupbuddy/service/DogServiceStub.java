package com.example.pupbuddy.service;

import com.example.pupbuddy.dao.IDogDAO;
import com.example.pupbuddy.dto.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
 

import java.util.List;

public class DogServiceStub implements IDogService{

    @Autowired
    private IDogDAO dogDAO;

    public DogServiceStub(){}

    public DogServiceStub(IDogDAO dogDAO){this.dogDAO = dogDAO;}

    @Override
    @Cacheable(value = "dog", key = "#id")
    public Dog fetchById(String id) {
        Dog foundDog = dogDAO.fetch(id);
        return foundDog;
    }

    @Override
    @CacheEvict(value = "dog", key = "#id")
    @CacheEvict(value = "delete", key = "#id")
    public void delete(String id) throws Exception {
        dogDAO.delete(id);
    }

    @Override
    public Dog save(Dog dog) throws Exception {
        return dogDAO.save(dog);
    }

    @Override
    @Cacheable("dog")
    public List<Dog> fetchAll() {
        return dogDAO.fetchAll();
    }
}
