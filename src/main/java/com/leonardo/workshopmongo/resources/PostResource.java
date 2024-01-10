package com.leonardo.workshopmongo.resources;

import com.leonardo.workshopmongo.domain.Post;
import com.leonardo.workshopmongo.domain.User;
import com.leonardo.workshopmongo.dto.UserDTO;
import com.leonardo.workshopmongo.services.PostService;
import com.leonardo.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
