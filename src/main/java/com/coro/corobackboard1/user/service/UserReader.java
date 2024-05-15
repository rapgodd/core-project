package com.coro.corobackboard1.user.service;

import com.coro.corobackboard1.user.entity.User;
import com.coro.corobackboard1.user.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor

public class UserReader {

    private final UserRepository userRepository;

    public UserDomain read(Long userId) {
         User user = userRepository.findById(userId)
                .orElseThrow(EntityNotFoundException::new);

         return user.toDomain();
    }

    public UserDomain read(String email) {
        User user = UserRepository.findBtEmail(email)
                .orElseThrow(EntityNotFoundException::new);
        return user.toDomain();
    }

}
