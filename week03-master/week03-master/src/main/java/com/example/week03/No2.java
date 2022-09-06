package com.example.week03;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class No2 {
    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String newpass(@PathVariable("name") String name){
        int rand = (int)(Math.random()*999999999);
        return  "Hi,"+ name + '\n' + "Your new password is " +rand +".";
    }
}
