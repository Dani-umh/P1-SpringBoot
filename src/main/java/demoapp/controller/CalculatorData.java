package demoapp.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CalculatorData {

    @NotNull(message = "Number 1 is required")
    private Double number1;

    @NotNull(message = "Number 2 is required")
    private Double number2;

    @NotNull(message = "Operation is required")
    @Pattern(regexp = "\\+|\\-|\\*|\\/", message = "Operation must be one of: +, -, *, /")
    private String operation;

    public CalculatorData() {
    }

    public Double getNumber1() {
        return number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
