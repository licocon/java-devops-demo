package com.example.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author licocon
 * @since 2022/6/14 16:31
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello java devops!";
    }
}
