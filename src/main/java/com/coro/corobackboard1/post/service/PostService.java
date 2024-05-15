package com.coro.corobackboard1.post.service;

import com.coro.corobackboard1.post.dto.PostRequest;
import com.coro.corobackboard1.post.dto.PostResponse;
import com.coro.corobackboard1.post.entity.Post;
import com.coro.corobackboard1.post.repository.PostRepository;
import com.coro.corobackboard1.user.dto.UserResponse;
import com.coro.corobackboard1.user.service.UserDomain;
import com.coro.corobackboard1.user.service.UserReader;
import com.coro.corobackboard1.user.entity.User;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final UserReader userReader;

    public PostResponse createPost(PostRequest request) {
        UserDomain user = userReader.read(request.writerId());
        Post post = Post.builder()
                .title(request.title())
                .content(request.content())
                .writer(user)
                .build();
        post = postRepository.save(post);
        return new PostResponse(post.getId(), post.getTitle(), post.getContent(), 0L, UserResponse.from(user.toDomain()));
    }
}
