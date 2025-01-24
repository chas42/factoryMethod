package com.demo.contract;

public abstract class Contract {

    private Double value;

    public abstract void print();

    public abstract void sign();

    public abstract void sendEmail();

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
