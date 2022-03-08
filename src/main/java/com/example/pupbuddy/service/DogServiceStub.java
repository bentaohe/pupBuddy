package com.example.pupbuddy.service;

import com.example.pupbuddy.dao.IDogDAO;
import com.example.pupbuddy.dto.Dog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DogServiceStub implements IDogService{

    @Autowired
    private IDogDAO dogDAO;

    public DogServiceStub(){}

    public DogServiceStub(IDogDAO dogDAO){this.dogDAO = dogDAO;}

    @Override
    public Dog fetchById(int id) {
        Dog foundDog = dogDAO.fetch(id);
        return foundDog;
    }

    @Override
    public void delete(int id) throws Exception {
        dogDAO.delete(id);
    }

    @Override
    public Dog save(Dog dog) throws Exception {
        return dogDAO.save(dog);
    }

    @Override
    public List<Dog> fetchAll() {
        return dogDAO.fetchAll();
    }
}
