package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();
    Long id = 0L;

    public List<Post> listAllPosts(){
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(id++, text, new Date()));
    }

}
