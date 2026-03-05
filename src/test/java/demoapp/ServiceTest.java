package demoapp;

import demoapp.service.SaludoService;
import demoapp.service.PalindromeService;
import demoapp.service.EvenService;
import demoapp.service.SquareService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ServiceTest {

    @Autowired
    SaludoService saludo;

    @Test
    public void contexLoads() throws Exception {
        assertThat(saludo).isNotNull();
    }

    @Test
    public void serviceSaludo() throws Exception {
        assertThat(saludo.saluda("Juan")).isEqualTo("Hola Juan");
    }

    @Autowired
    PalindromeService palindromeService;

    @Test
    public void palindromeTrue() throws Exception {
        assertThat(palindromeService.isPalindrome("reconocer")).isTrue();
    }

    @Test
    public void palindromeFalse() throws Exception {
        assertThat(palindromeService.isPalindrome("hola")).isFalse();
    }

    @Autowired
    EvenService evenService;

    @Test
    public void evenTrue() throws Exception {
        assertThat(evenService.isEven(4)).isTrue();
    }

    @Test
    public void evenFalse() throws Exception {
        assertThat(evenService.isEven(5)).isFalse();
    }

    @Autowired
    SquareService squareService;

    @Test
    public void squareTrue() throws Exception {
        assertThat(squareService.isSecondSquareOfFirst(4, 16)).isTrue();
    }

    @Test
    public void squareFalse() throws Exception {
        assertThat(squareService.isSecondSquareOfFirst(4, 15)).isFalse();
    }
}
