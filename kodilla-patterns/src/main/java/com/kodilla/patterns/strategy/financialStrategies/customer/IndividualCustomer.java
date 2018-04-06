package com.kodilla.patterns.strategy.financialStrategies.customer;

import com.kodilla.patterns.strategy.financialStrategies.predictors.ConservativePredictor;

public class IndividualCustomer extends Customer {
    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
