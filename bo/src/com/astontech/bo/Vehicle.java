package com.astontech.bo;
import java.util.Date;
public class Vehicle extends BaseBO{
    private int VehicleId;
    private int Year;
    private String LicensePlate;
    private String VIN;
    private String Color;
    private boolean IsPurchase;
    private int PurchasePrice;
    private Date PurchaseDate;
    private VehicleModel VehicleModel;

    public Vehicle(){}
    public Vehicle(String LicensePlate){
        this.LicensePlate = LicensePlate;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean IsPurchase() {
        return IsPurchase;
    }

    public void setIsPurchase(boolean IsPurchase) {
        this.IsPurchase = IsPurchase;
    }

    public int getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        PurchaseDate = purchaseDate;
    }

    public VehicleModel getVehicleModel() {
        return VehicleModel;
    }

    public void setVehicleModel(VehicleModel VehicleModel) {
        this.VehicleModel = VehicleModel;
    }

    public String ToString(){
        return "Id:"+this.getId()+" VehicleId:"+this.VehicleId+" Year:"+this.Year+" LicensePlate:"+this.LicensePlate+" VIN:"+this.VIN
                +" Color: "+this.Color+" IsPurchase:"+this.IsPurchase+" PurchasePrice:"+this.PurchasePrice+" PurchaseDate:"
                +this.PurchaseDate+" VehicleMake:"+this.VehicleModel.getVehicleMake().getVehicleMakeName()+" VehicleModel:"+this.VehicleModel.getVehicleModelName();
    }
}
