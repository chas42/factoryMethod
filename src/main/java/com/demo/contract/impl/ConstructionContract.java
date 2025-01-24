package com.demo.contract.impl;

import com.demo.contract.Contract;

public class ConstructionContract extends Contract {
    @Override
    public void print() {
        System.out.println("printing Construction Contract ...");
    }

    @Override
    public void sign() {
        System.out.println("signing Construction Contract ...");
    }

    @Override
    public void sendEmail() {
        System.out.println("sending email Construction Contract ...");
    }
}
