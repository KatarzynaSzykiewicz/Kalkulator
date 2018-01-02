package com.kodilla.test;

public class MyService {

    private CompanyAService serviceA;

    private CompanyBService serviceB;

    public MyService(CompanyAService serviceA, CompanyBService serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    public double getAveragePrice(){

        int priceA = serviceA.getValue();

        int priceB = serviceB.getValue();

        double average = (priceA + priceB)/2;

        return average;

    }
}
