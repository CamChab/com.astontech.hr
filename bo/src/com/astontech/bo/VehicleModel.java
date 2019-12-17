package com.astontech.bo;

public class VehicleModel extends BaseBO{
    private int VehicleModelId;
    private String VehicleModelName;
    private VehicleMake VehicleMake;

    public VehicleModel(){}
    public VehicleModel(String VehicleModelName){
        this.VehicleModelName = VehicleModelName;
    }

    public int getVehicleModelId() {
        return VehicleModelId;
    }

    public void setVehicleModelId(int vehicleModelId) {
        VehicleModelId = vehicleModelId;
    }

    public String getVehicleModelName() {
        return VehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        VehicleModelName = vehicleModelName;
    }

    public VehicleMake getVehicleMake() {
        return VehicleMake;
    }

    public void setVehicleMake(VehicleMake VehicleMake) {
        this.VehicleMake = VehicleMake;
    }
}
