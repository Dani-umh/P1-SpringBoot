package demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EvenFormController {

    @GetMapping("/evenform")
    public String showEvenForm(Model model) {
        model.addAttribute("evenData", new EvenData());
        return "evenForm";
    }
}
