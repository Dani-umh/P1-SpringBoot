package demoapp.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class SquareData {

    @Min(value = 0, message = "First number must be positive")
    @Max(value = 1000000, message = "First number too large")
    private int first;

    @Min(value = 0, message = "Second number must be positive")
    @Max(value = 1000000, message = "Second number too large")
    private int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}