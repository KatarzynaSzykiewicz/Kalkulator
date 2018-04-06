package com.kodilla.patterns.strategy.social.users;

import com.kodilla.patterns.strategy.social.publishers.SocialPublisher;

public class User {
    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public String getUserName() {
        return userName;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
