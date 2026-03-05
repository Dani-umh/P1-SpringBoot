package demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PalindromeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void palindromeEndpointTrue() throws Exception {
        this.mockMvc.perform(get("/palindrome/reconocer"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("is a palindrome")));
    }

    @Test
    public void palindromeEndpointFalse() throws Exception {
        this.mockMvc.perform(get("/palindrome/hola"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("is NOT a palindrome")));
    }
}