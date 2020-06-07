/*
 * Rhombus
 *
 * Java Class Creation
 *
 * Copyright Oleksandr Zorenko KNUTE
 *
 * Create a class from the attached document according to the order in your group .  The class must contain
 * 1.Constructor.
 * 2.Getters/Setters.
 * 3.5 methods.
 * 4.Override toString() method
 * 5.Override hash() and equals() methods.
 */
package com.company;

import java.util.Objects;

public class Rhombus
{
    private int side;
    private double angle;

    public Rhombus(int side, double angle)
    {
        this.side = side;
        this.angle = angle;
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

    public void setAngle(double angle)
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
    public String toString() 
    {
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


    //Override equals method
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rhombus rhombus = (Rhombus) o;
        
        return getSide() == rhombus.getSide() && Double.compare(rhombus.getAngle(), getAngle()) == 0;
    }

    //Override hash method
    @Override
    public int hashCode() 
    {
        return Objects.hash(getSide(), getAngle());
    }
}

