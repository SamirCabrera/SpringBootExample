package com.example.demo.API;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Model.Post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
    
    @GetMapping("/post")
    public String hello() {
        return " ";
    }

    public List<Post> postList() {
        Post post1 = new Post(1, 1, "Post1");
        Post post2 = new Post(2, 2, "Post2");
        Post post3 = new Post(3, 3, "Post3");

        ArrayList<Post> posts = new ArrayList<>();

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }
}
