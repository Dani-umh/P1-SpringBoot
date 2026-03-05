package demoapp.controller;

import demoapp.service.EvenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class EvenFormController {

    @Autowired
    private EvenService evenService;

    @GetMapping("/evenform")
    public String showEvenForm(Model model) {
        model.addAttribute("evenData", new EvenData());
        return "evenForm";
    }

    @PostMapping("/evenform")
    public String processEvenForm(@Valid EvenData evenData,
                                  BindingResult bindingResult,
                                  Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("evenData", evenData);
            return "evenForm";
        }

        boolean result = evenService.isEven(evenData.getNumber());

        if (result) {
            model.addAttribute("message", evenData.getNumber() + " is even");
        } else {
            model.addAttribute("message", evenData.getNumber() + " is NOT even");
        }

        return "evenResult";
    }
}
