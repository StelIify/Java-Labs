/*
 * RhombusFactory
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

public class RhombusFactory
{
    public static Rhombus create(int side, int angle)
    {
        Rhombus rhombus = new Rhombus(side, angle);
        return rhombus;
    }

}
