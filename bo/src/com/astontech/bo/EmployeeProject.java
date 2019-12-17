package com.astontech.bo;

import java.util.Date;

public class EmployeeProject extends BaseBO{
    private int EmployeeProjectId;
    private int ProjectId;
    private Employee ProjectEmployee;
    private EntityType ProjectType;
    private int VehicleId;
    private Date StartDate;
    private Date EndDate;
    private String Notes;

    public EmployeeProject(){}
    public EmployeeProject(int EmployeeProjectId){
        this.EmployeeProjectId = EmployeeProjectId;
    }

    public int getEmployeeProjectId() {
        return EmployeeProjectId;
    }

    public void setEmployeeProjectId(int employeeProjectId) {
        EmployeeProjectId = employeeProjectId;
    }

    public int getProjectId() {
        return ProjectId;
    }

    public void setProjectId(int projectId) {
        ProjectId = projectId;
    }

    public Employee getProjectEmployee() {
        return ProjectEmployee;
    }

    public void setProjectEmployee(Employee ProjectEmployee) {
        this.ProjectEmployee = ProjectEmployee;
    }

    public EntityType ProjectType() {
        return ProjectType;
    }

    public void setProjectType(EntityType ProjectType) {
        this.ProjectType = ProjectType;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
