package demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class EvenFormControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void postValidNumberShowsResult() throws Exception {
        this.mockMvc.perform(post("/evenform").param("number", "4"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("4 is even")));
    }

    @Test
    public void postInvalidNumberShowsValidationError() throws Exception {
        this.mockMvc.perform(post("/evenform").param("number", "-1"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Number must be positive")));
    }
}