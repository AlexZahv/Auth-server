package com.zahv.alex.buisiness.persistance.repository;

import com.zahv.alex.buisiness.persistance.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
