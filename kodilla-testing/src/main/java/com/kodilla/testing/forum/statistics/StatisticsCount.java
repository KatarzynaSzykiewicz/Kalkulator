package com.kodilla.testing.forum.statistics;

public class StatisticsCount {

    int userNumber;
    int postNumber;
    int commentNumber;
    private Statistics statistics;
    private double averagePostsNumberPerUser;
    private double averageCommendNumberPerUser;
    private double averageCommendNumberPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        userNumber = statistics.userNames().size();
        postNumber = statistics.postCount();
        commentNumber = statistics.commentsCount();
        this.statistics = statistics;
        averageCommendNumberPerUser = commentNumber / userNumber;
        averagePostsNumberPerUser = postNumber / userNumber;
        averageCommendNumberPerPost = commentNumber / postNumber;
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

    public int getUserNumber() {
        return userNumber;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

}
