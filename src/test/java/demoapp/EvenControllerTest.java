package demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class EvenControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void evenTrue() throws Exception {
        this.mockMvc.perform(get("/even/4"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("4 is even")));
    }

    @Test
    public void evenFalse() throws Exception {
        this.mockMvc.perform(get("/even/5"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("5 is NOT even")));
    }
}