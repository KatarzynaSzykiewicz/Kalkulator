package com.kodilla.patterns.strategy.financialStrategies.customer;

import com.kodilla.patterns.strategy.financialStrategies.predictors.AggressivePredictor;

public class IndividualYoungCustomer extends Customer {
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
