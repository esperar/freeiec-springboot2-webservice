package com.example.springAWS.web;

import com.example.springAWS.servicie.dto.PostsService;
import com.example.springAWS.web.dto.PostsResponseDto;
import com.example.springAWS.web.dto.PostsSaveRequestDto;
import com.example.springAWS.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiContoller {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){

        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id , @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id , requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
