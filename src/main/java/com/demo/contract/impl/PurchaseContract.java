package com.demo.contract.impl;

import com.demo.contract.Contract;

public class PurchaseContract extends Contract {
    @Override
    public void print() {
        System.out.println("printing Purchase Contract ...");
    }

    @Override
    public void sign() {
        System.out.println("signing Purchase Contract ...");
    }

    @Override
    public void sendEmail() {
        System.out.println("sending email  Purchase Contract ...");
    }
}
