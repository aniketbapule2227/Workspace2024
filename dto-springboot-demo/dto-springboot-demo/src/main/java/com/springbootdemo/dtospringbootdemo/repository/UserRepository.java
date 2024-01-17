package com.springbootdemo.dtospringbootdemo.repository;

import com.springbootdemo.dtospringbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
