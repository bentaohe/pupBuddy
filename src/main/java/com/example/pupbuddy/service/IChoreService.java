package com.example.pupbuddy.service;

import com.example.pupbuddy.dto.Chore;

import java.util.List;

public interface IChoreService {

    Chore fetchById(int id);

    void delete(int id) throws Exception;

    Chore save(Chore chore) throws Exception;

    List<Chore> fetchAll();
}
