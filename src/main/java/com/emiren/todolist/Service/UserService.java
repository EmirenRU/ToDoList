package com.emiren.todolist.Service;

public interface UserService {
    void registerUser(String username, String password);
    void authenticateUser(String username, String password);
}
