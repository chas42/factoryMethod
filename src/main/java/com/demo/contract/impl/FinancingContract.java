package com.demo.contract.impl;

import com.demo.contract.Contract;

public class FinancingContract extends Contract {
    @Override
    public void print() {
        System.out.println("printing Financing Contract ...");
    }

    @Override
    public void sign() {
        System.out.println("signing Financing Contract ...");
    }

    @Override
    public void sendEmail() {
        System.out.println("sending email Financing Contract ...");
    }
}
