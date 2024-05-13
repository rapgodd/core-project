package com.coro.corobackboard1.user.dto;

import com.coro.corobackboard1.user.service.UserInfo;

public record SignUpRequest(
        String username,
        String password,
        String email
) {
    public UserInfo toUserInfo(){

        return new UserInfo(
                email,
                password,
                username
        );
    }
}


