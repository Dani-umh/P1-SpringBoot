package demoapp.controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PalindromeData {

    @NotBlank(message = "The word cannot be empty")
    @Size(min = 2, max = 50, message = "The word must be between 2 and 50 characters")
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}