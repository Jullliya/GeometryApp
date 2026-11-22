package com.example;


import com.example.geometry.shape.Circle;
import com.example.geometry.shape.Rectangle;
import com.example.geometry.shape.Triangle;

public class Main {
    static void main() {

        Circle circle = new Circle(2.6);
        Rectangle rectangle = new Rectangle(5, 3.4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.printf("Circle area %.2f, perimeter - %.2f.%n",  circle.area(), circle.perimeter());
        System.out.printf("Rectangle area %.2f, perimeter - %.2f.%n",  rectangle.area(), rectangle.perimeter());
        System.out.printf("Triangle area %.2f, perimeter - %.2f.%n",  triangle.area(), triangle.perimeter());
    }
}
