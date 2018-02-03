package com.kodilla.testing.forum.statistics;

public class StatisticsCount {

    int userNumber;
    int postNumber;
    int commentNumber;
    private Statistics statistics;
    private double averagePostsNumberPerUser;
    private double averageCommendNumberPerUser;
    private double averageCommendNumberPerPost;



    double usersNumber =(double)userNumber;
    double postsNumber =(double)postNumber;
    double commentsNumber =(double)commentNumber;


    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.userNames().size();
        postsNumber = statistics.postCount();
        commentsNumber = statistics.commentsCount();
        this.statistics = statistics;
        averageCommendNumberPerUser = commentsNumber / usersNumber;
        averagePostsNumberPerUser = postsNumber / usersNumber;
        averageCommendNumberPerPost = commentsNumber / postsNumber;
    }


    public Statistics getStatistics() {
        return statistics;
    }


    public double getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public double getAverageCommendNumberPerUser() {
        return averageCommendNumberPerUser;
    }


    public double getAverageCommendNumberPerPost() {
        return averageCommendNumberPerPost;
    }


    public double getUsersNumber() {
        return usersNumber;
    }

    public double getPostsNumber() {
        return postsNumber;
    }

    public double getCommentsNumber() {
        return commentsNumber;
    }
}
