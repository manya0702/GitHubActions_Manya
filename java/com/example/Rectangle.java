package com.example;

public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Calculate and print the area
        double area = rect.calculateArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
