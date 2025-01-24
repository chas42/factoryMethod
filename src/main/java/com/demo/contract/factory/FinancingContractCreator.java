package com.demo.contract.factory;

import com.demo.contract.Contract;
import com.demo.contract.ContractCreator;
import com.demo.contract.impl.FinancingContract;

public class FinancingContractCreator implements ContractCreator {
    @Override
    public Contract createContract() {
        return new FinancingContract();
    }
}
