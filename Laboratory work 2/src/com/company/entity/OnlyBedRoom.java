/**
 * @author Oleksandr Zorenko KNUTE
 * @version 22.06.2020
 * Classname OnlyBedRoom
 *  Module 3 Task 2. Laboratory work №2
 *
 **/
package com.company.entity;

import com.company.interfaces.IBookKeeping;

public class OnlyBedRoom implements IBookKeeping
{
    private String hotelName;
    private double roomCostPerDay;
    private int numberOfStayingDays;

    public OnlyBedRoom(String hotelName, double roomCostPerDay, int numberOfStayingDays)
    {
        this.hotelName = hotelName;
        this.roomCostPerDay = roomCostPerDay;
        this.numberOfStayingDays = numberOfStayingDays;
    }

    public OnlyBedRoom()
    {

    }

    //Getters and Setters
    public String getHotelName(){
        return hotelName;
    }

    public void setHotelName(String hotelName){
        this.hotelName = hotelName;
    }
    public double getRoomCostPerDay() {
        return roomCostPerDay;
    }

    public void setRoomCostPerDay(double roomCostPerDay) {
        this.roomCostPerDay = roomCostPerDay;
    }

    public int getNumberOfStayingDays() {
        return numberOfStayingDays;
    }

    public void setNumberOfStayingDays(int numberOfStayingDays) {
        this.numberOfStayingDays = numberOfStayingDays;
    }

    //Calculating room price based on room cost and number of staying days
    @Override
    public double getRoomPrice()
    {
        return this.getRoomCostPerDay() * this.getNumberOfStayingDays();
    }

    @Override
    public String toString() {
        return "OnlyBedRoom{" +
                "hotelName='" + hotelName + '\'' +
                ", roomCostPerDay=" + roomCostPerDay +
                ", numberOfStayingDays=" + numberOfStayingDays +
                ", roomPrice= " + getRoomPrice() +
                '}';
    }
}
