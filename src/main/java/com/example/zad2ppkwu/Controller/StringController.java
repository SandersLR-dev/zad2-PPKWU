package com.example.zad2ppkwu.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/{text}")
    public String analizeString(@PathVariable String text){
        return null;
    }

}
