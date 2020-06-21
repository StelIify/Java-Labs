/**
 * @author Oleksandr Zorenko KNUTE
 * @version 1.0
 * Classname AbstractFactory
 * Class represents the programming pattern 'Abstract factory' for geometric figure Rhombus
 *  Module 2 Task 4. Programming patterns. Factory, Builder.
 *  Task description: Develop Abstract factory for your class
**/
package com.company;

public class AbstractFactory
{
    /**
     * Class constructor with parameters
     * Creates a class instance depending on requested figure
     * @param a and b set a sides of a Rhombus
     * @param figure specifies which figure should be created
     **/
    
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
