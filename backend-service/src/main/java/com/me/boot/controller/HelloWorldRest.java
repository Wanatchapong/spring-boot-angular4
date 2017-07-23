package com.me.boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldRest {

    @GetMapping(value = "/say")
    public ResponseEntity<String> say(@RequestParam(value = "msg") String msg) {
        return ResponseEntity.ok(msg);
    }
}
