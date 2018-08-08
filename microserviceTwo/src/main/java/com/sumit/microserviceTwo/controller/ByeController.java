package com.sumit.microserviceTwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

    @RequestMapping("/goodBye")
    public String sayGoodBye(){
        return "Good Bye";
    }
}
