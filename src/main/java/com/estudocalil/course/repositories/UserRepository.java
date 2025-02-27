package com.estudocalil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estudocalil.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
