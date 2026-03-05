package demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SquareFormController {

    @GetMapping("/squareform")
    public String showSquareForm(Model model) {
        model.addAttribute("squareData", new SquareData());
        return "squareForm";
    }
}
