/**
 * @author Oleksandr Zorenko KNUTE
 * @version 21.06.2020
 * Classname: RhombusFactory
 * Class represents the programming pattern 'Factory' for geometric figure Rhombus.
    Module 2 Task 4. Programming patterns. Factory, Builder.
    Task description: Develop Factory for your class
**/
package com.company;

public class RhombusFactory
{
    /**
     * Class constructor with parameters.
     * @param side sets a side of Rhombus
     * @param angle sets an angle of Rhombus
     * @return created instance of Rhombus
     **/
    public static Rhombus create(int side, int angle)
    {
        Rhombus rhombus = new Rhombus(side, angle);
        return rhombus;
    }

}
