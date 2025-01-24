package com.demo.contract.factory;

import com.demo.contract.ContractCreator;
import com.demo.contract.impl.ConstructionContract;
import com.demo.contract.Contract;

public class ConstructionContractCreator implements ContractCreator {
    @Override
    public Contract createContract() {
        return new ConstructionContract();
    }
}
