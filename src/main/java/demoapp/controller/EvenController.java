package demoapp.controller;

import demoapp.service.EvenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EvenController {

    @Autowired
    EvenService evenService;

    @GetMapping("/even/{number}")
    public String isEven(@PathVariable int number) {

        if (evenService.isEven(number)) {
            return number + " is even";
        } else {
            return number + " is NOT even";
        }
    }
}