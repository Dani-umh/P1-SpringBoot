package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double calculate(double number1, double number2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        switch (operation) {
            case "+":
                return number1 + number2;

            case "-":
                return number1 - number2;

            case "*":
                return number1 * number2;

            case "/":
                if (number2 == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return number1 / number2;

            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}