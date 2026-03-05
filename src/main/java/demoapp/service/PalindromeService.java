package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}
