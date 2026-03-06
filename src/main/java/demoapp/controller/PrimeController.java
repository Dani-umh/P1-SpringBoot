package demoapp.controller;

import demoapp.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeController {

    @Autowired
    PrimeService primeService;

    @RequestMapping("/prime/{number}")
    public String isPrime(@PathVariable int number) {

        if (primeService.isPrime(number)) {
            return number + " is prime";
        } else {
            return number + " is not prime";
        }

    }
}