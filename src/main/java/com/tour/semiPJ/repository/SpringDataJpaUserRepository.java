package com.tour.semiPJ.repository;

import com.tour.semiPJ.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaUserRepository extends JpaRepository<User, String>, UserRepository{
}
