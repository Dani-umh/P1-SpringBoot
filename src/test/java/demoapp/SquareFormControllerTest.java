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
public class SquareFormControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void postValidSquareShowsResult() throws Exception {

        this.mockMvc.perform(post("/squareform")
                        .param("first", "4")
                        .param("second", "16"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("16 is the square of 4")));
    }

    @Test
    public void postInvalidSquareShowsResult() throws Exception {

        this.mockMvc.perform(post("/squareform")
                        .param("first", "4")
                        .param("second", "15"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("15 is NOT the square of 4")));
    }

    @Test
    public void postValidationErrorShowsFormAgain() throws Exception {

        this.mockMvc.perform(post("/squareform")
                        .param("first", "-1")
                        .param("second", "4"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("First number must be positive")));
    }
}