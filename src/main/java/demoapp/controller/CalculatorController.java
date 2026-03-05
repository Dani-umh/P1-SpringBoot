package demoapp.controller;

import demoapp.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calculator/{number1}/{number2}/{operation}")
    public double calculate(
            @PathVariable double number1,
            @PathVariable double number2,
            @PathVariable String operation) {

        return calculatorService.calculate(number1, number2, operation);
    }
}