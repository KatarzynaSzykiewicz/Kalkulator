package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics0Posts() {

        //Given
        ArrayList<String> user = new ArrayList<>();
        user.add("a");
        user.add("b");
        Statistics statistics = Mockito.mock(Statistics.class);
        StatisticsCount count = new StatisticsCount();
        Mockito.when(statistics.commentsCount()).thenReturn(12);
        Mockito.when(statistics.postCount()).thenReturn(0);
        Mockito.when(statistics.userNames()).thenReturn(user);

        //When
        count.calculateAdvStatistics(statistics);

        //Then
        Assert.assertTrue(count.getUserNumber() == 2);
        Assert.assertTrue(count.getPostNumber() == 0);
        Assert.assertTrue(count.getCommentNumber() == 12);
        Assert.assertTrue(count.getAveragePostsNumberPerUser() == 0.0);
        Assert.assertTrue(count.getAverageCommendNumberPerUser() == 6.0);
        Assert.assertTrue(count.getAverageCommendNumberPerPost() == 0.0);

    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        ArrayList<String> users = new ArrayList<>();
        users.add("ccc");
        users.add("aaa");
        users.add("qqq");
        users.add("bdbh");
        users.add("uidh");
        Statistics statistics = Mockito.mock(Statistics.class);
        StatisticsCount stat = new StatisticsCount();
        Mockito.when(statistics.commentsCount()).thenReturn(120);
        Mockito.when(statistics.postCount()).thenReturn(1000);
        Mockito.when(statistics.userNames()).thenReturn(users);

        //When
        stat.calculateAdvStatistics(statistics);

        //Then
        Assert.assertTrue(stat.getCommentNumber() == 120);
        Assert.assertTrue(stat.getUserNumber() == 5);
        Assert.assertTrue(stat.getPostNumber() == 1000);
        Assert.assertTrue(stat.getAverageCommendNumberPerPost() == 0.0);
        Assert.assertTrue(stat.getAverageCommendNumberPerUser() == 24.0);
        Assert.assertTrue(stat.getAveragePostsNumberPerUser() == 200.0);
    }

    @Test
    public void testCalculateAdvStatistics0Comments() {
        //Given
        ArrayList<String> user = new ArrayList<>();
        user.add("a");
        user.add("z");
        user.add("l");

        Statistics statistics = Mockito.mock(Statistics.class);
        StatisticsCount stat = new StatisticsCount();
        Mockito.when(statistics.commentsCount()).thenReturn(0);
        Mockito.when(statistics.userNames()).thenReturn(user);
        Mockito.when(statistics.postCount()).thenReturn(5);

        //When
        stat.calculateAdvStatistics(statistics);

        //Then
        Assert.assertTrue(stat.getCommentNumber() == 0);
        Assert.assertTrue(stat.getPostNumber() == 5);
        Assert.assertTrue(stat.getUserNumber() == 3);
        Assert.assertTrue(stat.getAveragePostsNumberPerUser() == 1.0);
        Assert.assertTrue(stat.getAverageCommendNumberPerUser() == 0.0);
        Assert.assertTrue(stat.getAverageCommendNumberPerPost() == 0.0);
    }

    @Test
    public void testCalculateAdvStatisticsMorePostsThenComments() {

        //Given
        ArrayList<String> users = new ArrayList<>();
        users.add("am");
        users.add("hm");
        users.add("dg");
        users.add("fm");
        Statistics statistics = Mockito.mock(Statistics.class);
        StatisticsCount stat = new StatisticsCount();
        Mockito.when(statistics.postCount()).thenReturn(300);
        Mockito.when(statistics.commentsCount()).thenReturn(20);
        Mockito.when(statistics.userNames()).thenReturn(users);

        //When
        stat.calculateAdvStatistics(statistics);

        //Then
        Assert.assertTrue(stat.getCommentNumber() == 20);
        Assert.assertTrue(stat.getPostNumber() == 300);
        Assert.assertTrue(stat.getUserNumber() == 4);
        Assert.assertTrue(stat.getAveragePostsNumberPerUser() == 75.0);
        Assert.assertTrue(stat.getAverageCommendNumberPerUser() == 5.0);
        Assert.assertTrue(stat.getAverageCommendNumberPerPost() == 0.0);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThemPosts() {

        //Given
        ArrayList<String> users = new ArrayList<>();
        users.add("wle");
        users.add("adj");
        users.add("dkm");

        Statistics statistics = Mockito.mock(Statistics.class);
        StatisticsCount count = new StatisticsCount();

        Mockito.when(statistics.userNames()).thenReturn(users);
        Mockito.when(statistics.postCount()).thenReturn(10);
        Mockito.when(statistics.commentsCount()).thenReturn(50);

        //When
        count.calculateAdvStatistics(statistics);

        //Then
        Assert.assertTrue(count.getUserNumber() == 3);
        Assert.assertTrue(count.getPostNumber() == 10);
        Assert.assertTrue(count.getCommentNumber() == 50);
        Assert.assertTrue(count.getAveragePostsNumberPerUser() == 3.0);
        Assert.assertTrue(count.getAverageCommendNumberPerUser() == 16.0);
        Assert.assertTrue(count.getAverageCommendNumberPerPost() == 5.0);

    }

    @Test
    public void testCalculateAdvStatisticsZeroUsers() {
        //Given
        ArrayList<String> user = new ArrayList<>();
        Statistics statistics = Mockito.mock(Statistics.class);
        StatisticsCount count = new StatisticsCount();

        Mockito.when(statistics.userNames()).thenReturn(user);
        Mockito.when(statistics.postCount()).thenReturn(12);
        Mockito.when(statistics.commentsCount()).thenReturn(4);

        //When
        count.calculateAdvStatistics(statistics);

        //Then
        Assert.assertTrue(count.getUserNumber() == 0);
        Assert.assertTrue(count.getPostNumber() == 12);
        Assert.assertTrue(count.getCommentNumber() == 4);
        Assert.assertTrue(count.getAveragePostsNumberPerUser() == 0.0);
        Assert.assertTrue(count.getAverageCommendNumberPerUser() == 0.0);
        Assert.assertTrue(count.getAverageCommendNumberPerPost() == 0.0);
    }


    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        ArrayList<String> users = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            users.add("qqq" + i);
        }
        Statistics statistics = Mockito.mock(Statistics.class);
        StatisticsCount count = new StatisticsCount();

        Mockito.when(statistics.userNames()).thenReturn(users);
        Mockito.when(statistics.postCount()).thenReturn(421);
        Mockito.when(statistics.commentsCount()).thenReturn(653);

        //When
        count.calculateAdvStatistics(statistics);

        //Then
        Assert.assertTrue(count.getUserNumber() == 100);
        Assert.assertTrue(count.getPostNumber() == 421);
        Assert.assertTrue(count.getCommentNumber() == 653);
        Assert.assertTrue(count.getAverageCommendNumberPerUser() == 6.0);
        Assert.assertTrue(count.getAveragePostsNumberPerUser() == 4.0);
        Assert.assertTrue(count.getAverageCommendNumberPerPost() == 1.0);
    }
}
