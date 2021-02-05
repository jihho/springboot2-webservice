package com.jiho.book.springboot.web;

import com.jiho.book.springboot.service.posts.PostsService;
import com.jiho.book.springboot.web.dto.PostsListResponseDto;
import com.jiho.book.springboot.web.dto.PostsResponseDto;
import com.jiho.book.springboot.web.dto.PostsSaveRequestDto;
import com.jiho.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @GetMapping("/api/board")
    public List<PostsListResponseDto> index() {
        return postsService.findAllDesc();
    }

    @PostMapping("/api/board/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/board/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestsDto) {
        return postsService.update(id, requestsDto);
    }

    @GetMapping("/api/board/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
