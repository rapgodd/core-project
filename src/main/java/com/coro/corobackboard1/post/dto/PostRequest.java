package com.coro.corobackboard1.post.dto;

public record PostRequest(
        String title,
        String content,
        Long writerId  ) {
}
