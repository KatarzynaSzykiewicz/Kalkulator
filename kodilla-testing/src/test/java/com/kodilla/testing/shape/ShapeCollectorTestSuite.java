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
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresListSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(24, 12);
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertEquals(0, shapeCollector.getFiguresListSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(46);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(square, shapeCollector.getFigure(0));
    }
}
