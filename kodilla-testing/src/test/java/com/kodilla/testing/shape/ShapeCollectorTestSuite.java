package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.TreeMap;

@DisplayName("TDD: Shape Collection Tests: ")
public class ShapeCollectorTestSuite
{
    ShapeCollector shapeCollector = new ShapeCollector();

    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest()
    {

        System.out.println("Preparing to execute test #");
    }

    @AfterEach
    public void afterEveryTest()
    {
        System.out.println("Test Finished");
    }

    @Test
    void addFigureTest()
    {
        //Given
        ArrayList<Shape> temporaryShapes = new ArrayList<>();
        Square square1 = new Square(10);
        temporaryShapes.add(square1);

        //When
        Square square = new Square(10);
        shapeCollector.addFigure(square);

        //Then
        Assertions.assertEquals(temporaryShapes.size(), shapeCollector.shapes.size());
    }

    @Test
    void removeFigureTest()
    {
        //Given
        ArrayList<Shape> temporaryShapes = new ArrayList<>();
        Square square1 = new Square(10);
        Square square = new Square(10);
        shapeCollector.addFigure(square);

        //When
        shapeCollector.removeFigure(square);

        //Then
        Assertions.assertEquals(temporaryShapes.size(), shapeCollector.shapes.size());
    }

    @Test
    void getFigureTest()
    {
        //Given
        ArrayList<Shape> temporaryShapes = new ArrayList<>();
        Square square = new Square(10);

        //When
        temporaryShapes.add(square);
        shapeCollector.addFigure(square);


        //Then
        Assertions.assertEquals(temporaryShapes.get(0), shapeCollector.getFigure(0));
    }

    @Test
    void showFiguresTest()
    {
        //Given
        ArrayList<Shape> temporaryShapes = new ArrayList<>();
        Square square = new Square(10);
        Triangle triangle = new Triangle(10, 10);
        Circle circle = new Circle(10);

        //When
        temporaryShapes.add(square);
        temporaryShapes.add(triangle);
        temporaryShapes.add(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        String temporaryShapesString = "";
        for (Shape s : temporaryShapes)
        {
            temporaryShapesString += s + " ";
        }

        //Then
        Assertions.assertEquals(temporaryShapesString, shapeCollector.showFigures());
    }
    
}
