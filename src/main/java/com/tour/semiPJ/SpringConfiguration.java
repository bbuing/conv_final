package com.tour.semiPJ;

import com.tour.semiPJ.repository.UserRepository;
import com.tour.semiPJ.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    private final UserRepository userRepository;

    @Autowired
    public SpringConfiguration(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Bean
//    public UserService userService() {
//        return new UserService(userRepository);
//    }
}
