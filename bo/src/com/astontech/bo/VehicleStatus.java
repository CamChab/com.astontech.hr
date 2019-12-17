package com.astontech.bo;
import java.util.Date;
public class VehicleStatus extends BaseBO{
    private int VehicleStatusId;
    private Vehicle Vehicle;
    private EntityType VehicleStatusType;
    private String Notes;
    private Date CreateDate;

    public VehicleStatus(){}
    public VehicleStatus(int VehicleStatusId){
        this.VehicleStatusId = VehicleStatusId;
    }

    public int getVehicleStatusId() {
        return VehicleStatusId;
    }

    public void setVehicleStatusId(int vehicleStatusId) {
        VehicleStatusId = vehicleStatusId;
    }

    public Vehicle getVehicle() {
        return Vehicle;
    }

    public void setVehicle(Vehicle Vehicle) {
        this.Vehicle = Vehicle;
    }

    public EntityType getVehicleStatusType() {
        return VehicleStatusType;
    }

    public void setVehicleStatusType(EntityType VehicleStatuusType) {
        this.VehicleStatusType = VehicleStatuusType;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
}
