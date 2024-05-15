package com.coro.corobackboard1.post.api;

import com.coro.corobackboard1.post.dto.PostRequest;
import com.coro.corobackboard1.post.dto.PostResponse;
import com.coro.corobackboard1.post.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")

public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostResponse> createPost(@RequestBody PostRequest request) {
        PostResponse response = postService.createPost(request);
        return ResponseEntity.ok(response);
    }
}
