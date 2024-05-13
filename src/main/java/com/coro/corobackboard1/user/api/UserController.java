package com.coro.corobackboard1.user.api;

import com.coro.corobackboard1.user.dto.SignUpRequest;
import com.coro.corobackboard1.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi")
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<Long> signup(@RequestBody SignUpRequest signUpRequest) {
        Long userId = userService.signUp(signUpRequest.toUserInfo());
        return ResponseEntity.ok(userId);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<UserResponse> userInfo(@PathVariable Long userId) {
        userService.read(userId);
    }
}
