package com.coro.corobackboard1.user.repository;

import com.coro.corobackboard1.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}//<User : 엔티티의 클래스 타입, Long : 키 타입>
