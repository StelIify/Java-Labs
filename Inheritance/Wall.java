package com.company;

public class Wall extends Rectangle
{
    private String materialOfTheWall;
    private float materialPrice;
    private int durabilityOfMaterials;
    private String soundConductivity;
    private String thermalConductivity;
    private boolean isPlaster;
    private boolean isWhiteWashed;
    private String colorOfWhiteWashing;
    private float pricePlasterPerMeter;
    private float priceWhiteWashingPerMeter;
    private int amountOfWindows;

    public  Wall()
    {

    }

    public Wall(int length, int width, String materialOfTheWall, float materialPrice,
                int durabilityOfMaterials, String soundConductivity, String thermalConductivity,
                boolean isPlaster, boolean isWhiteWashed, String colorOfWhiteWashing,
                float pricePlasterPerMeter, float priceWhiteWashingPerMeter, int amountOfWindows)
    {
        super(length, width);
        this.materialOfTheWall = materialOfTheWall;
        this.materialPrice = materialPrice;
        this.durabilityOfMaterials = durabilityOfMaterials;
        this.soundConductivity = soundConductivity;
        this.thermalConductivity = thermalConductivity;
        this.isPlaster = isPlaster;
        this.isWhiteWashed = isWhiteWashed;
        this.colorOfWhiteWashing = colorOfWhiteWashing;
        this.pricePlasterPerMeter = pricePlasterPerMeter;
        this.priceWhiteWashingPerMeter = priceWhiteWashingPerMeter;
        this.amountOfWindows = amountOfWindows;
    }

    //Getters and Setters
    public String getMaterialOfTheWall()
    {
        return materialOfTheWall;
    }

    public void setMaterialOfTheWall(String materialOfTheWall)
    {
        this.materialOfTheWall = materialOfTheWall;
    }

    public float getMaterialPrice()
    {
        return materialPrice;
    }

    public void setMaterialPrice(float materialPrice)
    {
        this.materialPrice = materialPrice;
    }

    public int getDurabilityOfMaterials()
    {
        return durabilityOfMaterials;
    }

    public void setDurabilityOfMaterials(int durabilityOfMaterials)
    {
        this.durabilityOfMaterials = durabilityOfMaterials;
    }

    public String getSoundConductivity()
    {
        return soundConductivity;
    }

    public void setSoundConductivity(String soundConductivity)
    {
        this.soundConductivity = soundConductivity;
    }

    public String getThermalConductivity()
    {
        return thermalConductivity;
    }

    public void setThermalConductivity(String thermalConductivity)
    {
        this.thermalConductivity = thermalConductivity;
    }

    public boolean isPlaster()
    {
        return isPlaster;
    }

    public void setPlaster(boolean plaster)
    {
        isPlaster = plaster;
    }

    public boolean isWhiteWashed()
    {
        return isWhiteWashed;
    }

    public void setWhiteWashed(boolean whiteWashed)
    {
        isWhiteWashed = whiteWashed;
    }

    public String getColorOfWhiteWashing()
    {
        return colorOfWhiteWashing;
    }

    public void setColorOfWhiteWashing(String colorOfWhiteWashing)
    {
        this.colorOfWhiteWashing = colorOfWhiteWashing;
    }

    public float getPricePlasterPerMeter()
    {
        return pricePlasterPerMeter;
    }

    public void setPricePlasterPerMeter(float pricePlasterPerMeter)
    {
        this.pricePlasterPerMeter = pricePlasterPerMeter;
    }

    public float getPriceWhiteWashingPerMeter()
    {
        return priceWhiteWashingPerMeter;
    }

    public void setPriceWhiteWashingPerMeter(float priceWhiteWashingPerMeter)
    {
        this.priceWhiteWashingPerMeter = priceWhiteWashingPerMeter;
    }

    public int getAmountOfWindows()
    {
        return amountOfWindows;
    }

    public void setAmountOfWindows(int amountOfWindows)
    {
        this.amountOfWindows = amountOfWindows;
    }

    //Calculating plaster price
    public float GetPlasterPrice()
    {
        return super.getArea() * pricePlasterPerMeter;
    }

    //Calculating whitewashing price
    public  float GetWhiteWashingPrice()
    {
       return super.getArea() * priceWhiteWashingPerMeter;
    }
}
