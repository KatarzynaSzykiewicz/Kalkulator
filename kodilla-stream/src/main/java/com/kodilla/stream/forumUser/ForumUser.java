package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final Integer userID;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int numberOfPosts;


    public ForumUser(final int userID, final String userName, final char userSex, final LocalDate birthDate, final int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }


    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}




