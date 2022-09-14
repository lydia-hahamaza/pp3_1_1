package com.example.pp3_1_1.service;

import com.example.pp3_1_1.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> getAll();

    User getById(int id);

    void update(User user);

    void delete(int id);
}
