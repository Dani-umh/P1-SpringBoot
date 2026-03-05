package demoapp.controller;

import demoapp.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PalindromeController {

    @Autowired
    private PalindromeService palindromeService;

    @GetMapping("/palindrome/{word}")
    public String checkPalindrome(@PathVariable String word) {

        boolean result = palindromeService.isPalindrome(word);

        if (result) {
            return word + " is a palindrome";
        } else {
            return word + " is NOT a palindrome";
        }
    }
}