/*
 * Rhombus
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


public class Rhombus implements IGeometry
{
    private int side;
    private int angle;

    public Rhombus(int side, int angle)
    {
        this.side = side;
        this.angle = angle;
    }
    public  Rhombus()
    {

    }
    //Getters and Setters
    public int getSide()
    {
        return side;
    }

    public void setSide(int side)
    {
        this.side = side;
    }

    public double getAngle()
    {
        return angle;
    }

    public void setAngle(int angle)
    {
        this.angle = angle;
    }


    //Getting shortDiagonal
    public double getShortDiagonal()
    {
        return side * Math.sqrt(2 - 2 * Math.cos(angle));
    }

    //GettingLongDiagonal
    public double getLongDiagonal()
    {
        return side * Math.sqrt(2 + 2 * Math.cos(angle));
    }
    //Calculate Area of the Rhombus
    public double getArea()
    {
        return 0.5 * getLongDiagonal() * getShortDiagonal();
    }
    //Calculate Perimeter of the Rhombus
    public double getPerimeter()
    {
        return 4 * side;
    }

    //Getting radius of the circle inscribed in rhombus
    public double getCircleRadius()
    {
        double area = getArea();
        return area / (2*side);
    }

    //Overriding toString method
    @Override
    public String toString() {
        return "Rombus{" +
                "side= " + side +
                "angle= " + angle +
                "area= " + this.getArea() +
                "perimeter= " + this.getPerimeter()+
                "long diagonal= " + this.getLongDiagonal()+
                "short diagonal= " + this.getShortDiagonal()+
                "circle radius " + this.getCircleRadius()+
                "hashCode= " + this.hashCode()+
                '}';

    }


}

