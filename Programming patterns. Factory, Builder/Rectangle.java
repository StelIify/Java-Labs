/*
 * Rectangle
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

public class Rectangle implements IGeometry
{
    private int length;
    private int width;

    public  Rectangle()
    {
    }

    public  Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    //Getters and Setters
    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    //Calculating Area
    public double getArea()
    {
      return length * width;
    }

    //Calculating perimeter
    @Override
    public double getPerimeter()
    {
        return 2 *(length * width);
    }

    //Calculating diagonal
    public double getDiagonal()
    {
       return (float)Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    //Overriding toString method
    @Override
    public String toString()
    {
        return "Rectangle{" +
            "length=" + length +
            ", width=" + width +
            ", area=" + getArea() +
            ", perimeter=" + getPerimeter() +
            ", diagonal=" + getDiagonal() +
            '}';
    }

}
