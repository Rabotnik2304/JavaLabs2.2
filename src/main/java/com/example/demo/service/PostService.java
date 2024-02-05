package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(new Post("Здравствуйте", Date.from(Instant.now())));
        posts.add(new Post("Кто вы?", Date.from(Instant.now())));
        posts.add(new Post("ДО свидания", Date.from(Instant.now())));
        return posts;
    }
}
