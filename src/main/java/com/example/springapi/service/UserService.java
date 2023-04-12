package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "John", "jhon@gmail.com");
        User user2 = new User(2, "Jane", "jane@gmail.com");
        User user3 = new User(3, "Jack", "jack@gmail.com");
        User user4 = new User(4, "Jill", "jill@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4));
    }
    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user : userList) {
            if (user.getId() == id) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
