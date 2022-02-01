package com.example.demo;

import java.lang.reflect.Array;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public static int arr [] ={2,4,6};
    @GetMapping("/")
    public String index(){
        return "Sudha";
    }

    @GetMapping("/out")
    public int[] out(){
        return arr;
    }
    @PostMapping("/add")
    public void add(@RequestBody int data)
    {
        arr[0]=data;
    }
    
    
}
