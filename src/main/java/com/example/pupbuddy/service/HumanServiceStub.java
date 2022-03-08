package com.example.pupbuddy.service;

import com.example.pupbuddy.dao.IHumanDAO;
import com.example.pupbuddy.dto.Human;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HumanServiceStub implements IHumanService{

    @Autowired
    private IHumanDAO humanDAO;

    public HumanServiceStub(){}

    public HumanServiceStub(IHumanDAO humanDAO){this.humanDAO = humanDAO;}

    @Override
    public Human fetchById(int id) {
        Human foundHuman = humanDAO.fetch(id);
        return foundHuman;
    }

    @Override
    public void delete(int id) throws Exception {
        humanDAO.delete(id);
    }

    @Override
    public Human save(Human human) throws Exception {
        return humanDAO.save(human);
    }

    @Override
    public List<Human> fetchAll() {
        return humanDAO.fetchAll();
    }
}
