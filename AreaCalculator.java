package mathematics_projects;
import java.lang.Math;

public class AreaCalculator {

    // Square Area Calculation
    public static double squareArea(double side) {
        return side * side;
    }

    // Rectangle Area Calculation
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Triangle Area Calculation
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Circle Area Calculation
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Trapezoid Area Calculation
    public static double trapezoidArea(double a, double b, double height) {
        return 0.5 * (a + b) * height;
    }

    // Parallelogram Area Calculation
    public static double parallelogramArea(double base, double height) {
        return base * height;
    }

    // Rhombus Area Calculation
    public static double rhombusArea(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    // Regular Polygon Area Calculation
    public static double regularPolygonArea(int n, double sideLength) {
        return (n * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        // Example usage:
        double squareAreaResult = squareArea(5);
        System.out.println("Area of square with side length 5: " + squareAreaResult);

        double circleAreaResult = circleArea(7);
        System.out.println("Area of circle with radius 7: " + circleAreaResult);
        
        // You can call other methods similarly to calculate the area for different shapes
    }
}
