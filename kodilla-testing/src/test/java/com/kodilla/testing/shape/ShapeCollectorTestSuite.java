package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure("Triangle");
        //Then
        Assert.assertEquals(shapeCollector.showFigures(), "Triangle");
}

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean result = shapeCollector.removeFigure("Triangle");
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getFigure(0));
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure("Triangle");
        //When
        String retrivedShapeCollector;
        retrivedShapeCollector = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shapeCollector, retrivedShapeCollector);
    }

    @Test
    public void testShowFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure("Triangle");
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertEquals(shapeCollector.showFigures(), "Triangle");
    }
}
