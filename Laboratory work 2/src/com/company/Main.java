/**
 * @author Oleksandr Zorenko KNUTE
 * @version 22.06.2020
 * Classname OnlyBedRoom
 *  Module 3 Task 2. Laboratory work №2
 *  Task description:
 *
 *  A hotel has two types of rooms: only bedroom and  lux room.
 * 1. Create two appropriate classes and 5 objects of each one.
 * 2. Calculate the total room price.
 * 3. Find the highest room price.
 * 4. Find he lowest room price.
 * 5. The average room price
 * 6. Which type of room is more expensive
 **/

package com.company;

import com.company.entity.LuxRoom;
import com.company.entity.OnlyBedRoom;
import com.company.interfaces.IBookKeeping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args)
    {
        //Creating 5 instances of each class
        OnlyBedRoom onlyBedRoom1 = new OnlyBedRoom("Driskill", 200, 3);
        OnlyBedRoom onlyBedRoom2 = new OnlyBedRoom("Driskill", 180, 4);
        OnlyBedRoom onlyBedRoom3 = new OnlyBedRoom("Driskill", 250, 2);
        OnlyBedRoom onlyBedRoom4 = new OnlyBedRoom("Driskill", 300, 5);
        OnlyBedRoom onlyBedRoom5 = new OnlyBedRoom("Driskill", 190, 6);

        LuxRoom luxRoom1 = new LuxRoom("Driskill", 500, 4, 100);
        LuxRoom luxRoom2 = new LuxRoom("Driskill", 620, 3, 110);
        LuxRoom luxRoom3 = new LuxRoom("Driskill", 580, 5, 115);
        LuxRoom luxRoom4 = new LuxRoom("Driskill", 650, 2, 130);
        LuxRoom luxRoom5 = new LuxRoom("Driskill", 700, 2, 140);

        //Adding created instances to the list for further manipulations
        List<IBookKeeping> rooms = new ArrayList<>();
        rooms.add(onlyBedRoom1);
        rooms.add(onlyBedRoom2);
        rooms.add(onlyBedRoom3);
        rooms.add(onlyBedRoom4);
        rooms.add(onlyBedRoom5);
        rooms.add(luxRoom1);
        rooms.add(luxRoom2);
        rooms.add(luxRoom3);
        rooms.add(luxRoom4);
        rooms.add(luxRoom5);

        //Finding  the price of all the rooms
        double roomPriceSum = rooms.stream().mapToDouble(IBookKeeping::getRoomPrice).sum();
        System.out.println("The total sum is " + roomPriceSum);

        //Finding the biggest room price of all rooms
        IBookKeeping theBiggestRoomPrice = rooms.stream()
                .max(Comparator.comparingDouble(IBookKeeping::getRoomPrice))
                .orElse(null);
        System.out.println("The biggest room price is " + theBiggestRoomPrice);

        //Finding the most expensive room in only bedrooms
        OptionalDouble theMostExpensiveOnlyBedRoom = rooms.stream().filter(r -> r instanceof OnlyBedRoom)
                .mapToDouble(IBookKeeping::getRoomPrice).max();
        System.out.println("The most expensive only bedroom is" +theMostExpensiveOnlyBedRoom);

        //Finding the most expensive room in lux rooms only
        OptionalDouble theMostExpensiveLuxRoom = rooms.stream().filter(r -> r instanceof LuxRoom)
                .mapToDouble(IBookKeeping::getRoomPrice).max();
        System.out.println("The most expensive lux room is " + theMostExpensiveLuxRoom);

        //Finding the lowest room price of all rooms
        IBookKeeping theLowestRoomPrice = rooms.stream()
                .min(Comparator.comparingDouble(IBookKeeping::getRoomPrice))
                .orElse(null);
        System.out.println("The lowest room price is " + theLowestRoomPrice);

        //Finding the lowest room price in only bedrooms
        OptionalDouble theLowestOnlyBedRoomPrice = rooms.stream().filter(r -> r instanceof OnlyBedRoom)
                .mapToDouble(IBookKeeping::getRoomPrice).min();
        System.out.println("The lowest only bedroom price is " + theLowestOnlyBedRoomPrice);

        //Finding the lowest lux room price
        OptionalDouble theLowestLuxRoomPrice = rooms.stream().filter(r -> r instanceof LuxRoom)
                .mapToDouble(IBookKeeping::getRoomPrice).max();
        System.out.println("The lowest lux room price is " + theLowestLuxRoomPrice);

        //Finding average room price of all rooms
        double averageRoomsPrice = rooms.stream().mapToDouble(IBookKeeping::getRoomPrice).average().orElse(0);
            System.out.println("Average room price is " + averageRoomsPrice);

        //Finding average room price price in only bedroom
        OptionalDouble averageOnlyBedRoomPrice = rooms.stream().filter(r -> r instanceof OnlyBedRoom)
                .mapToDouble(IBookKeeping::getRoomPrice).average();
            System.out.println("Average room price in only bedroom is " + averageOnlyBedRoomPrice);

        //Finding average lux room price
        OptionalDouble averageLuxRoomPrice = rooms.stream().filter(r -> r instanceof OnlyBedRoom)
                .mapToDouble(IBookKeeping::getRoomPrice).average();
            System.out.println("Average lux room price is " + averageLuxRoomPrice);

         //Finding sum price of only bedrooms
        double sumOnlyBedRoomPrice = rooms.stream().filter(r -> r instanceof OnlyBedRoom)
                .mapToDouble(IBookKeeping::getRoomPrice).sum();
            System.out.println("Sum price of only bedrooms is " + sumOnlyBedRoomPrice);

            //Finding sum lux room price
        double sumLuxRoomPrice = rooms.stream().filter(r -> r instanceof OnlyBedRoom)
                .mapToDouble(IBookKeeping::getRoomPrice).sum();
            System.out.println("Sum lux rooms price is" + sumLuxRoomPrice);

        if(sumOnlyBedRoomPrice > sumLuxRoomPrice)
        {
            System.out.println("OnlyBedRoom has more expensive prices");
        }
        else
        {
            System.out.println("LuxRoom has more expensive prices");
        }




    }
}
