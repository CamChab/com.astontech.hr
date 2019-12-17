package com.astontech.bo;
import java.util.Date;
public class Training extends BaseBO{
    private int TrainingId;
    private Employee TrainingEmployee;
    private String TrainingName;
    private Date CreateDate;

    public Training(){}
    public Training(String TrainingName){
        this.TrainingName = TrainingName;
    }

    public int getTrainingId() {
        return TrainingId;
    }

    public void setTrainingId(int trainingId) {
        TrainingId = trainingId;
    }

    public Employee getTrainingEmployee() {
        return TrainingEmployee;
    }

    public void setTrainingEmployee(Employee TrainingEmployee) {
        this.TrainingEmployee = TrainingEmployee;
    }

    public String getTrainingName() {
        return TrainingName;
    }

    public void setTrainingName(String trainingName) {
        TrainingName = trainingName;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
}
