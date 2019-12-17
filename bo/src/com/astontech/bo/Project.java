package com.astontech.bo;
import java.util.Date;

public class Project extends BaseBO{
    private int ProjectId;
    private Client ProjectClient;
    private EntityType ProjectType;
    private int Rate;
    private Date StartDate;
    private Date EndDate;
    private String ProjectName;

    public Project(){}
    public Project(String ProjectName){
        this.ProjectName = ProjectName;
    }

    public int getProjectId() {
        return ProjectId;
    }

    public void setProjectId(int projectId) {
        ProjectId = projectId;
    }

    public Client getProjectClient() {
        return ProjectClient;
    }

    public void setProjectClient(Client ProjectClient) {
        this.ProjectClient = ProjectClient;
    }

    public EntityType getProjectType() {
        return ProjectType;
    }

    public void setProjectType(EntityType ProjectType) {
        this.ProjectType = ProjectType;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
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

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }
}
