package com.coro.corobackboard1.post.dto;

import com.coro.corobackboard1.user.dto.UserResponse;

public record PostResponse(
        Long postId,
        String title,
        String content,
        Long viewCount,
        UserResponse user
) {
}
