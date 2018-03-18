package com.kodilla.good.patterns.challenges.shop.users;

public class InformationServiceProcessor implements InformationService{
    @Override
    public void inform(User user) {
        SendMailTo();
    }

    private void SendMailTo() {
        System.out.println("I'm sending an email.");
    }

}
