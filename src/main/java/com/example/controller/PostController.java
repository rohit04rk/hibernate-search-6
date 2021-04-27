package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Post;
import com.example.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService postService;

	@PostMapping("add-post")
	public ResponseEntity<String> addUser(@RequestBody Post post) {

		postService.addPost(post);

		return new ResponseEntity<String>("Post Added Successfully", HttpStatus.OK);
	}

}
