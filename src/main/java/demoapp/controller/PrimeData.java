package demoapp.controller;

import javax.validation.constraints.NotNull;

public class PrimeData {

    @NotNull
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}