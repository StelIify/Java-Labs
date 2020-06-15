/*
 * Main
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

public class Main
{

    public static void main(String[] args)
    {
        // 1st method of object creation using constructor with parameters

        Rhombus rhombus1 = new Rhombus(5, 2);

        System.out.println(rhombus1.getArea());

        // 2nd method of object creation using empty constructor and initialising through setters

        Rhombus rhombus2 = new Rhombus();
        rhombus2.setSide(12);
        rhombus2.setAngle(3);

        System.out.println(rhombus2.getArea());

        //3rd method of object creation using RhombusFactory

        Rhombus rhombus3 = RhombusFactory.create(7, 4);

        System.out.println(rhombus3.getArea());

        //4th method of object creation using Abstract Factory

        IGeometry rhombus4 = AbstractFactory.create(4, 8, Figure.RHOMBUS);

        System.out.println(rhombus4.getArea());

        //Using builder to create object

        Student student1 = new Student.Builder()
                .setFirstName("Oleksandr")
                .setSecondName("Zorenko")
                .setPatronymic("Evgenievich")
                .setDateOfBirth("09.04.1998")
                .setCountryOfBirth("Ukraine")
                .setAge(22)
                .setHeight(190)
                .setWeight(76)
                .setGender("male")
                .setHomeAddress("Bila Tserkva, Heroiv Krut 83")
                .setPhoneNumber(674186743)
                .setParentsAddress("Bila Tserkva, Heroiv Krut 83")
                .setEmergencyParentContact("mother: Zorenko Yulia ")
                .setParentPhoneNumber(989376524)
                .setUniversity("KNUTE")
                .setUniversityEntryDate("22.08.2016")
                .setBudgetPlace(true)
                .setFaculty("FIT")
                .setSpecialisation("Digital Economics")
                .setYearOfStudy(5)
                .setSportAchievements(false)
                .setScienceAchievements(false)
                .setAcademicPerformance("Average")
                .Build();

        System.out.println(student1);

        Student student2 = new Student.Builder()
                .setSimilarTo(student1)
                .setFirstName("Oleksiy")
                .setSecondName("Shevchenko")
                .Build();
        System.out.println(student2);



    }
}
