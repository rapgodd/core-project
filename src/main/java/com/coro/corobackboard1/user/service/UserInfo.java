package com.coro.corobackboard1.user.service;

import javax.swing.*;

public record UserInfo(
        String email,
        String password,
        String name
) {}