package com.astontech.bo;
import java.util.Date;
public class TrainingData extends BaseBO{
    private int TrainingDataId;
    private Training Training;
    private EntityType TrainingDataType;
    private String TrainingDataValue;
    private Date CreateDate;

    public TrainingData(){}
    public TrainingData(int TrainingDataId){
        this.TrainingDataId = TrainingDataId;
    }


    public int getTrainingDataId() {
        return TrainingDataId;
    }

    public void setTrainingDataId(int trainingDataId) {
        TrainingDataId = trainingDataId;
    }

    public Training getTraining() {
        return Training;
    }

    public void setTraining(Training Training) {
        this.Training = Training;
    }

    public EntityType getTrainingDataType() {
        return TrainingDataType;
    }

    public void setTrainingDataType(EntityType TrainingDataType) {
        this.TrainingDataType = TrainingDataType;
    }

    public String getTrainingDataValue() {
        return TrainingDataValue;
    }

    public void setTrainingDataValue(String trainingDataValue) {
        TrainingDataValue = trainingDataValue;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
}
