package demoapp.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

public class EvenData {

    @Min(value = 0, message = "Number must be positive")
    @Max(value = 1000000, message = "Number too large")
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
