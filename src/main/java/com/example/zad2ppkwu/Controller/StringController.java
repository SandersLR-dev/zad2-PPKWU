package com.example.zad2ppkwu.Controller;

import com.example.zad2ppkwu.StringInterpreter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/{text}")
    public StringInterpreter analizeString(@PathVariable String text){

        StringInterpreter stringInterpreter = new StringInterpreter();
        stringInterpreter.analise(text);

        return stringInterpreter;
    }

}
