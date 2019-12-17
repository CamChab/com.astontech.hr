package com.astontech.bo;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;


public class Person extends BaseBO{

    //region PROPERTIES
    private int PersonId;
    private String Title;
    private String FirstName;
    private String LastName;
    private String DisplayFirstName;
    private String Gender;
    private Date CreateDate;
    private boolean IsDeleted;
    private List<Email> Emails;
    private int abababab;
    //endregion
    //region CONSTRUCTORS
    public Person(){
        this.Emails = new ArrayList<Email>();
    }
    public Person(String LastName){
        this.LastName = LastName;
    }
    //endregion
    //region GETTERS / SETTERS
    public void setPersonId(int PersonId){
        this.PersonId = PersonId;
    }
    public int getPersonId(){
        return this.PersonId;
    }
    public void setTitle(String Title){
        this.Title = Title;
    }
    public String getTitle(){
        return this.Title;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getLastName(){
        return this.LastName;
    }
    public void setDisplayFirstName(String DisplayFirstName){
        this.DisplayFirstName = DisplayFirstName;
    }
    public String getDisplayFirstName(){
        return this.DisplayFirstName;
    }
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    public String getGender(){
        return this.Gender;
    }
    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public boolean isDeleted() {
        return IsDeleted;
    }

    public void setDeleted(boolean deleted) {
        IsDeleted = deleted;
    }
    public List<Email> getEmails(){
        return this.Emails;
    }
    public void setEmails(List<Email> emailList){
        this.Emails = emailList;
    }
    //endregion
    //region CUSTOM METHODS
    public static boolean isNullOrEmpty(String s){
        return s == null || s.length() == 0;
    }

    public String GetFullName(){
        if(isNullOrEmpty(this.FirstName) && isNullOrEmpty(this.LastName))
            return "No Name Set";
        else if(isNullOrEmpty(this.FirstName))
            return this.LastName;
        else if(isNullOrEmpty(this.LastName))
            return this.FirstName;
        else
            return this.FirstName+" "+this.LastName;
    }
    //endregion
}