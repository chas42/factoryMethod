package com.demo.contract.factory;

import com.demo.contract.Contract;
import com.demo.contract.ContractCreator;
import com.demo.contract.impl.PurchaseContract;

public class PurchaseContractCreator implements ContractCreator {
    @Override
    public Contract createContract() {
        return new PurchaseContract();
    }
}
