package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class MyController {

    private MyService service;

    @Autowired
    public MyController(MyService service) {
        this.service = service;
        System.out.println("MyController constructor has been called");
    }

    @GetMapping(value = "")
    public String helloMessage(){
        return "Hello!!!";
    }

    @GetMapping("/getName")
    public String getName(){
        return service.getName();
    }

}
