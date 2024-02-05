package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PostRepository;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public PostService(PostRepository postRepository){
        this.postRepository=postRepository;
    }
    public void create(String text){
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
    public List<Post> listAllPosts(){
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }
}
