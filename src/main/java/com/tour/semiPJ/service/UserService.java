package com.tour.semiPJ.service;

import com.tour.semiPJ.domain.User;
import com.tour.semiPJ.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User join(User user) {
        userRepository.save(user);
    }
}
