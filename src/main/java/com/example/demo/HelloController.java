package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public ResponseEntity<Person> helloWorld()
    {
        Person p = new Person("Santosh", 23,"Hello World");
      // String hello = "Hello World";
       return ResponseEntity.ok(p);

    }
}
