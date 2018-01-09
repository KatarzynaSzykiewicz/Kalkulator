package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

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
       OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(n = null);
       //When
        int result = oddNumbersExterminator.exterminate();
       //Then
        Assert.assertEquals(null, result);
   }

   public void testOddNumbersExterminatorNormalList(){
        //Given
       OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(n = );
       //When
       //Then
   }
}
