package com.coro.corobackboard1.user.repository;

import com.coro.corobackboard1.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findBtEmail(String email) {
    }
}//<User : 엔티티의 클래스 타입, Long : 키 타입>
