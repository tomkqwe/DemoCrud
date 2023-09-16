package ru.lebedev.DemoCrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @RequestMapping("/hello")
    String hello() {
        return "Hello from my first Endpoint";
    }

}
