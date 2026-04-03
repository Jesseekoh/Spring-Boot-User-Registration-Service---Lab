package com.jesseekoh.user_registration_service;

public interface UserRepository {

    void save(User user);

    User findByEmail(String email);

}