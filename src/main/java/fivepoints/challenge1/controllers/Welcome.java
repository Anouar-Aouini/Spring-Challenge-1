package fivepoints.challenge1.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String helloWorld(){
        return "Welcome!";
    }
}
