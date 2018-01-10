package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test

    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(9);
        number.add(13);
        number.add(20);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> output = oddNumbersExterminator.exterminate(number);

        //Then
        for (Integer integer : output){
            Assert.assertTrue(integer % 2 == 0);
        }
    }

/*   public void testOddNumbersExterminatorNormalList(){
        //Given
       OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(n = );
       //When
       //Then
   }*/
}
