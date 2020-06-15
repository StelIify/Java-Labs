/*
 * Triangle
 *
 * Programming patterns. Factory, Builder
 *
 * Copyright Oleksandr Zorenko KNUTE
 *
 * Develop for your class
 *
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student
 */
package com.company;

public class Triangle implements IGeometry {

    private double sideA;
    private double sideB;
    private double sideC;

    //Constructor with 3 sides
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    //Constructor with 2 sides and calculating the third
    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC =  Math.sqrt(sideA*sideA + sideB+sideB);
    }

    public Triangle()
    {
    }

    //Getters and Setters
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //Implementing getArea method from IGeometry interface
    @Override
    public double getArea()
    {
        double perimeter = getPerimeter();
        return Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
    }

    //Implementing getPerimeter method from IGeometry interface
    @Override
    public double getPerimeter()
    {
        return sideA + sideB + sideC;
    }

    //Overriding toString method
    @Override
    public String toString()
    {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB= " + sideB +
                ", sideC= " + sideC +
                ", Perimeter= " + getPerimeter() +
                ", Area= " + getArea() +
                '}';
    }
}