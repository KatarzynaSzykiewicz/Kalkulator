package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
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

   public void testOddNumbersExterminatorEmptyList(){
       //Given
       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.isEmpty();
       OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
       //When
        ArrayList<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);
       //Then
        Assert.assertEquals(0, oddNumbers.size());
   }

   @Test

   public void testOddNumbersExterminatorNormalList(){
        //Given
       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.add(11);
       numbers.add(12);
       numbers.add(21);
       numbers.add(28);
       OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
       //When
       ArrayList<Integer>oddNumbers = oddNumbersExterminator.exterminate(numbers);
       //Then
       for(Integer integer : oddNumbers){
        Assert.assertTrue(integer % 2 == 0);
       }
   }
}
