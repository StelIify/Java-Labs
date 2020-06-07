package com.company;

import java.time.LocalDate;

public class House extends Wall
{
    private float housePrice;
    private LocalDate dateOfPurchase;
    private String homeAddress;
    private int amountOfNeighbours;
    private boolean isWithGarden;
    private float areaSize;
    private boolean isInCity;
    private float distanceToCityCenter;
    private int numberOfRooms;

    public House(float housePrice, LocalDate dateOfPurchase, String homeAddress,
                 int amountOfNeighbours, boolean isWithGarden,
                 float areaSize, boolean isInCity, float distanceToCityCenter)
    {
        this.housePrice = housePrice;
        this.dateOfPurchase = dateOfPurchase;
        this.homeAddress = homeAddress;
        this.amountOfNeighbours = amountOfNeighbours;
        this.isWithGarden = isWithGarden;
        this.areaSize = areaSize;
        this.isInCity = isInCity;
        this.distanceToCityCenter = distanceToCityCenter;
    }

    //Getters And Setters
    public float getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(float housePrice) {
        this.housePrice = housePrice;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getAmountOfNeighbours() {
        return amountOfNeighbours;
    }

    public void setAmountOfNeighbours(int amountOfNeighbours) {
        this.amountOfNeighbours = amountOfNeighbours;
    }

    public boolean isWithGarden() {
        return isWithGarden;
    }

    public void setWithGarden(boolean withGarden) {
        isWithGarden = withGarden;
    }

    public float getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(float areaSize) {
        this.areaSize = areaSize;
    }

    public boolean isInCity() {
        return isInCity;
    }

    public void setInCity(boolean inCity) {
        isInCity = inCity;
    }

    public float getDistanceToCityCenter() {
        return distanceToCityCenter;
    }

    public void setDistanceToCityCenter(float distanceToCityCenter) {
        this.distanceToCityCenter = distanceToCityCenter;
    }

    //Calculating price for plastering all house
    public float PriceForPlasteringAllHouse()
    {
       return super.GetPlasterPrice() * numberOfRooms;
    }
    
    //Calculating price for whiteWashing all house
    public float PriceForWhiteWashingAllHouse()
    {
      return super.GetWhiteWashingPrice() * numberOfRooms;
    }

}
