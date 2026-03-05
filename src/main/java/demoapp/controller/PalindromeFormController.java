package demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PalindromeFormController {

    @GetMapping("/palindromeform")
    public String showForm(PalindromeData palindromeData) {
        return "palindromeForm";
    }
}