package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics(){

        //Given
        ArrayList<String> user = new ArrayList();
        user.add("a");
        user.add("b");
        Statistics statistics = Mockito.mock(Statistics.class);
        StatisticsCount count = new StatisticsCount();
        Mockito.when(statistics.commentsCount()).thenReturn(12);
        Mockito.when(statistics.postCount()).thenReturn(4);
        Mockito.when(statistics.userNames()).thenReturn(user);

        //When
        count.calculateAdvStatistics(statistics);

        //Then
        Assert.assertTrue(count.getUserNumber() == 2);
        Assert.assertTrue(count.getPostNumber() == 4);
        Assert.assertTrue(count.getCommentNumber() == 12);
        Assert.assertTrue(count.getAveragePostsNumberPerUser() == 2.0);
        Assert.assertTrue(count.getAverageCommendNumberPerUser() == 6.0);
        Assert.assertTrue(count.getAverageCommendNumberPerPost() == 3.0);

    }


}
