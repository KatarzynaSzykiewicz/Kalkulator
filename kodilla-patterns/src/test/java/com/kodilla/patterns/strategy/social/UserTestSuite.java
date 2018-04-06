package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.User;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User pablo = new Millenials("Pablo");
        User gonzales = new YGeneration("Golzales");
        User sanchez = new ZGeneration("Sanchez");

        //When
        String pabloShouldUse = pablo.sharePost();
        System.out.println("Pablo is " + pabloShouldUse);
        String gonzalesShouldUse = gonzales.sharePost();
        System.out.println("Gonzales is " + gonzalesShouldUse);
        String sanchezShouldUse = sanchez.sharePost();
        System.out.println("Sanchez is " + sanchezShouldUse);

        //Then
        Assert.assertEquals(pabloShouldUse, "Using Facebook.");
        Assert.assertEquals(gonzalesShouldUse, "Using Snapchat.");
        Assert.assertEquals(sanchezShouldUse, "Using Twitter.");
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User sanchez = new ZGeneration("Sanchez");

        //When
        String sanchezShouldUse = sanchez.sharePost();
        System.out.println("Sanchez is " + sanchezShouldUse);
        sanchez.setSocialPublisher(new FacebookPublisher());
        sanchezShouldUse = sanchez.sharePost();
        System.out.println("Sanchez changed to " + sanchezShouldUse);

        //Then
        Assert.assertEquals(sanchezShouldUse, "Using Facebook." );
    }
}
