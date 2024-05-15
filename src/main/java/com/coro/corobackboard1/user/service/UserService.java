package com.coro.corobackboard1.user.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserAppender userAppender;
    private final UserReader userReader;


    public Long signUp(UserInfo userInfo) {
        log.info("SignUp");
        return userAppender.append(userInfo);
    }

    public UserDomain getUserInfo(Long userId) {
        return userReader.read(userId);
    }
}
