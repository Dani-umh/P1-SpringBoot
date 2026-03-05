package demoapp.controller;

import demoapp.service.SquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class SquareFormController {

    @Autowired
    private SquareService squareService;

    @GetMapping("/squareform")
    public String showSquareForm(Model model) {
        model.addAttribute("squareData", new SquareData());
        return "squareForm";
    }

    @PostMapping("/squareform")
    public String processSquareForm(@Valid SquareData squareData,
                                    BindingResult bindingResult,
                                    Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("squareData", squareData);
            return "squareForm";
        }

        boolean result = squareService.isSecondSquareOfFirst(
                squareData.getFirst(),
                squareData.getSecond()
        );

        if (result) {
            model.addAttribute("message",
                    squareData.getSecond() + " is the square of " + squareData.getFirst());
        } else {
            model.addAttribute("message",
                    squareData.getSecond() + " is NOT the square of " + squareData.getFirst());
        }

        return "squareResult";
    }
}
