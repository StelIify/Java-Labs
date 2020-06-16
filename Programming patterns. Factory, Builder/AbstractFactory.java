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

public class AbstractFactory
{
    public  static IGeometry create(int a, int b, Figure figure)
    {
        switch (figure)
        {
            case RECTANGLE: return new Rectangle(a, b);
            case RHOMBUS: return new Rhombus(a, b);
            case TRIANGLE: return new Triangle(a, b);
            default: return null;
        }
    }
}
