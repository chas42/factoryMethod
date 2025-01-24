package com.demo;

import com.demo.contract.Contract;
import com.demo.contract.ContractCreator;
import com.demo.contract.factory.ConstructionContractCreator;
import com.demo.contract.factory.ExchangeContratcCreator;
import com.demo.contract.factory.FinancingContractCreator;
import com.demo.contract.factory.PurchaseContractCreator;

public class Main {
    public static void main(String[] args) {

        ContractCreator creator = new FinancingContractCreator();
        Contract contract = creator.createContract();
        contract.print();
        contract.sendEmail();

        creator = new ExchangeContratcCreator();
        contract = creator.createContract();
        contract.print();
        contract.sign();

        creator = new ConstructionContractCreator();
        contract = creator.createContract();
        contract.print();
        contract.sendEmail();

        creator = new ConstructionContractCreator();
        contract = creator.createContract();
        contract.print();
        contract.sign();

        creator = new PurchaseContractCreator();
        contract = creator.createContract();
        contract.print();
        contract.sendEmail();

        
    }
}