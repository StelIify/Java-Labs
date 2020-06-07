/*
 * Rectangle
 *
 * Polymorphism
 *
 * Copyright Oleksandr Zorenko KNUTE
 *
 * Polymorphism.
 *
 * Create and implement  two interfaces for your class.
 */

package com.company;

public class Rectangle implements IGeometry, IPackaging
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
    public float getArea()
    {
      return length * width;
    }

    //Calculating perimeter
    @Override
    public float getPerimeter()
    {
        return 2 *(length * width);
    }

    //Calculating diagonal
    @Override
    public float getDiagonal()
    {
       return (float)Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    //Implement interface method toString()
    @Override
    public String toString()
    {
        rreturn "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ", diagonal=" + getDiagonal() +
                '}';
    }

    //Implement interface method toJSON()
    @Override
    public String toJSON()
    {
        String json = "Rectangle{"
                + "\""  + "length\":" + this.getLength()
                + ","
                + "\""  + "width\":" + this.getWidth()
                + "\""  + "area\":" + this.getArea()
                + ","
                + "\""  + "perimeter\":" + this.getPerimeter()
                + "\""  + "diagonal\":" + this.getDiagonal()
                + ","
                + "}";
        return json;
    }

    //Implement interface method toXML()
    @Override
    public String toXML()
    {
        String xml = "<Rectangle>"
                + "<length>" + this.getLength() + "</length>"
                + "<width>" + this.getWidth() + "</width>"
                + "<area>" + this.getArea() + "</length>"
                + "<perimeter>" + this.getPerimeter() + "</width>"
                + "<diagonal>" + this.getDiagonal() + "</length>"
                +  "</Rectangle>";

        return xml;
    }

    //Implement interface method toConsole()
    @Override
    public void toConsole()
    {
        float area = getArea();
        float perimeter = getPerimeter();
        float diagonal = getDiagonal();

        System.out.println("Properties of rectangle: ");
        System.out.println("Length: " + length + "Width: " + width + "Area: " + area
        + "Perimeter: " + perimeter + "Diagonal " + diagonal);
    }
}
