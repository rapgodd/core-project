package com.coro.corobackboard1.user.service;

import com.coro.corobackboard1.user.entity.User;
import com.coro.corobackboard1.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserAppender {

    private final UserRepository userRepository;

    public Long append(UserInfo userInfo) {

        User user = User.builder()
                .name(userInfo.name())
                .email(userInfo.email())
                .password(userInfo.password())
                .build();
        //유저 엔티티와 유저 인포를 연결하고 있음.

        User saved = userRepository.save(user);
        return saved.getId();
    }
}
