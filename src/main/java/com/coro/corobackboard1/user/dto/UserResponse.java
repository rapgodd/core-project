package com.coro.corobackboard1.user.dto;

import com.coro.corobackboard1.user.service.UserDomain;

public record UserResponse(
        Long id,
        String name,
        String email
) {

    public static UserResponse from(UserDomain domain) {
        return new UserResponse(
                domain.id(),
                domain.info().name(),
                domain.info().email()
        );
    }//도메인 객체에서 id, name, email을 가져온다.


}