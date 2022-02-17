package com.example.demo.calculator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.coyote.http11.Constants.a;

@RestController
public class Calwithpath {

    @RequestMapping("add")
    public  String  add(@RequestParam int a, @RequestParam int b){
        int sum = a+b;
        return "addition is ::"+sum;

    }

    @RequestMapping("/sub/{a}/{b}")
    public  String  sub(@PathVariable int a, @PathVariable int b){
        int sum = a-b;
        return "addition is ::"+sum;

    }
}
