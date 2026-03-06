package demoapp;

import demoapp.service.SaludoService;
import demoapp.service.PalindromeService;
import demoapp.service.EvenService;
import demoapp.service.SquareService;
import demoapp.service.CalculatorService;
import demoapp.service.PrimeService;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
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

    @Autowired
    CalculatorService calculatorService;

    @Test
    public void calculatorAdd() throws Exception {
        assertThat(calculatorService.calculate(4, 2, "+")).isEqualTo(6);
    }

    @Test
    public void calculatorSubtract() throws Exception {
        assertThat(calculatorService.calculate(4, 2, "-")).isEqualTo(2);
    }

    @Test
    public void calculatorMultiply() throws Exception {
        assertThat(calculatorService.calculate(4, 2, "*")).isEqualTo(8);
    }

    @Test
    public void calculatorDivide() throws Exception {
        assertThat(calculatorService.calculate(4, 2, "/")).isEqualTo(2);
    }

    @Test
    public void calculatorDivisionByZero() throws Exception {
        assertThatThrownBy(() -> calculatorService.calculate(4, 0, "/"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void calculatorInvalidOperation() throws Exception {
        assertThatThrownBy(() -> calculatorService.calculate(4, 2, "%"))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @Autowired
    PrimeService primeService;

    @Test
    public void primeTrue() throws Exception {
        assertThat(primeService.isPrime(7)).isTrue();
    }

    @Test
    public void primeFalse() throws Exception {
        assertThat(primeService.isPrime(8)).isFalse();
    }

    @Test
    public void primeOneFalse() throws Exception {
        assertThat(primeService.isPrime(1)).isFalse();
    }

    @Test
    public void primeZeroFalse() throws Exception {
        assertThat(primeService.isPrime(0)).isFalse();
    }
}
