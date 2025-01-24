package com.demo.contract.impl;

import com.demo.contract.Contract;

public class RentalContract extends Contract {
    @Override
    public void print() {
        System.out.println("printing Rental Contract ...");
    }

    @Override
    public void sign() {
        System.out.println("signing email Rental Contract ...");
    }

    @Override
    public void sendEmail() {
        System.out.println("sending email Rental Contract ...");
    }
}
