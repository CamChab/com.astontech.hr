package com.astontech.bo;
import java.util.Date;
public class Review extends BaseBO{
    private int ReviewId;
    private String ReviewName;
    private Date ReviewDate;
    private Employee ReviewEmployee;

    public Review(){}
    public Review(String ReviewName){
        this.ReviewName = ReviewName;
    }

    public int getReviewId() {
        return ReviewId;
    }

    public void setReviewId(int reviewId) {
        ReviewId = reviewId;
    }

    public String getReviewName() {
        return ReviewName;
    }

    public void setReviewName(String reviewName) {
        ReviewName = reviewName;
    }

    public Date getReviewDate() {
        return ReviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        ReviewDate = reviewDate;
    }

    public Employee getReviewEmployee() {
        return ReviewEmployee;
    }

    public void setReviewEmployee(Employee ReviewEmployee) {
        this.ReviewEmployee = ReviewEmployee;
    }
}
