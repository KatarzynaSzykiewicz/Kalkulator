package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;

public class ZGeneration extends User{
    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}
