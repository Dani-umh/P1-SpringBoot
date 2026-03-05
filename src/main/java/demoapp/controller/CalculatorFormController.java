package demoapp.controller;

import demoapp.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorFormController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calculatorform")
    public String calculatorForm(Model model) {

        model.addAttribute("calculatorData", new CalculatorData());

        return "calculatorForm";
    }

    @PostMapping("/calculatorform")
    public String calculatorSubmit(
            @ModelAttribute CalculatorData calculatorData,
            Model model) {

        double result = calculatorService.calculate(
                calculatorData.getNumber1(),
                calculatorData.getNumber2(),
                calculatorData.getOperation()
        );

        model.addAttribute("result", result);

        return "calculatorResult";
    }
}