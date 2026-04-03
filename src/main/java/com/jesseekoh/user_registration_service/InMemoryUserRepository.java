package com.jesseekoh.user_registration_service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserRepository implements UserRepository {

    private Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user.getEmail());
        users.put(user.getEmail(), user);
        System.out.println("Saved user successfully");
    }

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }

}
