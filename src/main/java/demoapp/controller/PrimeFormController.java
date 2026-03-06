package demoapp.controller;

import demoapp.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
public class PrimeFormController {

    @Autowired
    PrimeService primeService;

    @GetMapping("/primeform")
    public String primeForm(Model model) {
        model.addAttribute("primeData", new PrimeData());
        return "primeForm";
    }

    @PostMapping("/primeform")
    public String primeSubmit(@Valid @ModelAttribute PrimeData primeData,
                              BindingResult bindingResult,
                              Model model) {

        if (bindingResult.hasErrors()) {
            return "primeForm";
        }

        boolean result = primeService.isPrime(primeData.getNumber());

        model.addAttribute("number", primeData.getNumber());
        model.addAttribute("result", result);

        return "primeResult";
    }

}