package com.astontech.bo;
import java.util.Date;
public class ReviewData extends BaseBO{
    private int ReviewDataId;
    private Review Review;
    private EntityType ReviewDataType;
    private String ReviewDataValue;
    private Date CreateDate;

    public ReviewData(){}
    public ReviewData(int ReviewDataId){
        this.ReviewDataId = ReviewDataId;
    }

    public int getReviewDataId() {
        return ReviewDataId;
    }

    public void setReviewDataId(int reviewDataId) {
        ReviewDataId = reviewDataId;
    }

    public Review getReview() {
        return Review;
    }

    public void setReview(Review Review) {
        this.Review = Review;
    }

    public EntityType getReviewDataType() {
        return ReviewDataType;
    }

    public void setReviewDataType(EntityType ReviewDataType) {
        this.ReviewDataType = ReviewDataType;
    }

    public String getReviewDataValue() {
        return ReviewDataValue;
    }

    public void setReviewDataValue(String reviewDataValue) {
        ReviewDataValue = reviewDataValue;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }
}
