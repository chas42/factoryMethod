package com.demo.contract.impl;

import com.demo.contract.Contract;

public class ExchangeContract extends Contract {

    @Override
    public void print() {
        System.out.println("printing Exchange Contract ...");
    }

    @Override
    public void sign() {
        System.out.println("signing Exchange Contract ...");
    }

    @Override
    public void sendEmail() {
        System.out.println("sending email Exchange Contract ...");
    }
}
