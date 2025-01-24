package com.demo.contract;

public class BadContract {

    public static final String CONTRACT_TYPE_CONSTRUCTION = "CONSTRUCTION";
    public static final String CONTRACT_TYPE_EXCHANGE = "EXCHANGE";
    public static final String CONTRACT_TYPE_RENTAL = "RENTAL";

    private final String type;

    public BadContract(String contractType) {
        this.type = contractType;
    }

    public void sign() {
        if (type.equals(CONTRACT_TYPE_CONSTRUCTION)) {
            System.out.println("signing email Construction Contract ...");
        }

        if (type.equals(CONTRACT_TYPE_EXCHANGE)) {
            System.out.println("signing email Exchange Contract ...");
        }

        if (type.equals(CONTRACT_TYPE_RENTAL)) {
            System.out.println("signing email Rental Contract ...");
        }

    }

    public void sendEmail() {
        if (type.equals(CONTRACT_TYPE_CONSTRUCTION)) {
            System.out.println("sending email Construction Contract ...");
        }
        if (type.equals(CONTRACT_TYPE_EXCHANGE)) {
            System.out.println("sending email Rental Exchange Contract ...");
        }
        if (type.equals(CONTRACT_TYPE_RENTAL)) {
            System.out.println("sending email Rental Contract ...");
        }

    }



}
