package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("greeting")
    public ResponseEntity<String> greeting(@RequestAttribute("name") String name) {
        return ResponseEntity.ok("Hello World!" + name );
    }
}
