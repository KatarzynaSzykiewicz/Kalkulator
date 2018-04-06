package com.kodilla.patterns.strategy.financialStrategies.customer;

import com.kodilla.patterns.strategy.financialStrategies.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
