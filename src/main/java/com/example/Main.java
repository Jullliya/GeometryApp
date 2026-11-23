package com.example;


import com.example.geometry.shape.Circle;
import com.example.geometry.shape.Rectangle;
import com.example.geometry.shape.Triangle;
import com.example.geometry.ShapeComparator;
import com.example.geometry.UnitsConverter;


public class Main {
    static void main() {

        Circle circle = new Circle(2.6);
        Rectangle rectangle = new Rectangle(5.0, 3.4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.printf("Circle area %.2f cm^2, perimeter - %.2f cm.%n",  circle.area(), circle.perimeter());
        System.out.printf("Rectangle area %.2f cm^2, perimeter - %.2f cm.%n",  rectangle.area(), rectangle.perimeter());
        System.out.printf("Triangle area %.2f cm^2, perimeter - %.2f cm.%n",  triangle.area(), triangle.perimeter());

        System.out.println("\nCompare area of circle and rectangle:");
        ShapeComparator.areaCompare(circle.area(), rectangle.area());

        System.out.println("\nCompare perimeter of rectangle and triangle:");
        ShapeComparator.perimeterCompare(rectangle.perimeter(), triangle.perimeter());

        System.out.printf("\nCircle area %.2f mm^2 or %.6f m^2, perimeter - %.2f mm or %.6f m.%n",
                UnitsConverter.convertAreaToMm(circle.area()), UnitsConverter.convertAreaToM(circle.area()),
                UnitsConverter.convertPerimeterToMm(circle.perimeter()), UnitsConverter.convertPerimeterToM(circle.perimeter()));
    }
}
