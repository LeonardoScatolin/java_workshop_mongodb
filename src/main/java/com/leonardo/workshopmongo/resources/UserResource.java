package com.leonardo.workshopmongo.resources;

import com.leonardo.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User leo = new User("1", "Leo Scatolin", "leo@gmail.ocm");
        User alex = new User("2", "Alex Green", "alex@gmail.ocm");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(leo, alex));

        return ResponseEntity.ok().body(list);
    }

}
