package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<Post>();
    public PostService(){
        posts.add(new Post("Здравствуйте", new Date(10,10,2014)));
        posts.add(new Post("Кто вы?", new Date(10,10,2015)));
        posts.add(new Post("ДО свидания", new Date(10,10,2016)));
    }
    public void create(String text){
        posts.add(new Post(text, new Date()));
    }
    public List<Post> listAllPosts(){
        return posts;
    }
}
