package com.vv.customqualifier.controller;

import com.vv.customqualifier.domain.MyQualifier;
import com.vv.customqualifier.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(@MyQualifier("MyServiceB") MyService myService ) {
        this.myService = myService;
    }

    @GetMapping("/task")
    public String performTask() {
        myService.performTask();
        return "Task performed!";
    }
}

