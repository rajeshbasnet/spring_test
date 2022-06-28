package com.example.springtest.controllers;

import com.example.springtest.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/")
    public List<String> getMessage() {
        List<String> list = new ArrayList<>();
        list.add("hello world");
        return list;
    }
}
