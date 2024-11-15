package com.ifpb.edu.couse.repositories;

import com.ifpb.edu.couse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
