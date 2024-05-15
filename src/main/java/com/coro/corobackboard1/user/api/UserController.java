package com.coro.corobackboard1.user.api;

import com.coro.corobackboard1.user.dto.SignUpRequest;
import com.coro.corobackboard1.user.dto.UserResponse;
import com.coro.corobackboard1.user.service.UserDomain;
import com.coro.corobackboard1.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
//    private final UserResponse UserResponse;

    @PostMapping("/users")
    public ResponseEntity<Long> signup(@RequestBody SignUpRequest signUpRequest) {
        Long userId = userService.signUp(signUpRequest.toUserInfo());
        return ResponseEntity.ok(userId);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<UserResponse> login(Long userId) {
        UserDomain domain = userService.login(userId);
        UserResponse response = UserResponse.from(domain);
        return ResponseEntity.ok(response);
    }
}
