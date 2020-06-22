/**
 * @author Oleksandr Zorenko KNUTE
 * @version 22.06.2020
 * Classname LuxRoom
 * Module 3 Task 2. Laboratory work №2
 *
 **/
package com.company.entity;

import com.company.interfaces.IBookKeeping;

public class LuxRoom implements IBookKeeping
{
    private String hotelName;
    private double roomCostPerDay;
    private int numberOfStayingDays;
    private double serviceCharge;

    public LuxRoom(String hotelName, double roomCostPerDay, int numberOfStayingDays, double serviceCharge) {
        this.hotelName = hotelName;
        this.roomCostPerDay = roomCostPerDay;
        this.numberOfStayingDays = numberOfStayingDays;
        this.serviceCharge = serviceCharge;
    }

    public LuxRoom()
    {

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
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

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge)
    {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double getRoomPrice()
    {
        return (this.getRoomCostPerDay() * this.getNumberOfStayingDays()) + this.getServiceCharge();
    }

    @Override
    public String toString() {
        return "LuxRoom{" +
                "hotelName='" + hotelName + '\'' +
                ", roomCostPerDay=" + roomCostPerDay +
                ", numberOfStayingDays=" + numberOfStayingDays +
                ", serviceCharge=" + serviceCharge +
                ", roomPrice= " + getRoomPrice() +
                '}';
    }
}
