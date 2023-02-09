package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public Iterable<Post> listAllPosts(){
        List<Post> posts = new ArrayList<>();
        Post post1 = new Post("What's up?");
        Post post2 = new Post("How are you?");
        Post post3 = new Post("How you doing?");
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        return posts;
    }
}
