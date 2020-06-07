/*
 * Rectangle
 *
 * Inheritance
 *
 * Copyright Oleksandr Zorenko KNUTE
 *
 * 1.Create a child  from the class Rectangle.
 * 2.Create another class as a super class for your one.  Or create a daughterly class for your one.
 */

package com.company;

public class Rectangle
{
    protected int length;
    protected int width;
    protected final double PI = 3.14;

    public  Rectangle()
    {

    }

    public  Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

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

    public int getArea()
    {
      return length * width;
    }
}
