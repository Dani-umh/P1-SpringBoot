package demoapp.controller;

import demoapp.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PalindromeFormController {

    @Autowired
    private PalindromeService palindromeService;

    @GetMapping("/palindromeform")
    public String showForm(PalindromeData palindromeData) {
        return "palindromeForm";
    }

    @PostMapping("/palindromeform")
    public String processForm(@Valid PalindromeData palindromeData,
                              BindingResult bindingResult,
                              Model model) {

        if (bindingResult.hasErrors()) {
            return "palindromeForm";
        }

        boolean result = palindromeService.isPalindrome(palindromeData.getWord());

        if (result) {
            model.addAttribute("message", palindromeData.getWord() + " is a palindrome");
        } else {
            model.addAttribute("message", palindromeData.getWord() + " is NOT a palindrome");
        }

        return "palindromeResult";
    }
}