package com.example.week03;

import org.springframework.web.bind.annotation.*;

@RestController
public class test {
    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.GET)
    public Double add(@PathVariable("num1") double a,
                      @PathVariable("num2") double b){
        return a+b;
    }
    @RequestMapping(value = "/minus/{num1}/{num2}", method = RequestMethod.GET)
    public Double minus(@PathVariable("num1") double a,
                     @PathVariable("num2") double b){
        return a-b;
    }
    @RequestMapping(value = "/aaaa", method = RequestMethod.GET)
    public Double multiply(@RequestParam("num1") double num1,
                        @RequestParam("num2") double num2){
        return num1*num2;
    }
    @RequestMapping(value = "/devide", method = RequestMethod.GET)
    public Double divide(@RequestParam("num1") double num1,
                           @RequestParam("num2") double num2){
        return num1/num2;
    }
}
