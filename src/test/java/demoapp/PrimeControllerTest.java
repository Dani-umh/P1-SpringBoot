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
public class PrimeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void primeTrue() throws Exception {
        this.mockMvc.perform(get("/prime/7"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("7 is prime")));
    }

    @Test
    public void primeFalse() throws Exception {
        this.mockMvc.perform(get("/prime/8"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("8 is not prime")));
    }

}