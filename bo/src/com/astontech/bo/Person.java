package com.astontech.bo;

import com.astontech.bo.interfaces.ICompareTo;
import com.astontech.bo.interfaces.IPerson;
import common.helpers.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Person extends BaseBO implements IPerson, ICompareTo {

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
    //endregion
    //region CONSTRUCTORS
    public Person(){
        this.Emails = new ArrayList<Email>();
    }
    public Person(String LastName){
        this.LastName = LastName;
    }
    public Person(String FirstName,String LastName){this.FirstName=FirstName;this.LastName=LastName;}
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


    public String GetFullName(){
        if(StringHelper.isNullOrEmpty(this.FirstName) && StringHelper.isNullOrEmpty(this.LastName))
            return "No Name Set";
        else if(StringHelper.isNullOrEmpty(this.FirstName))
            return this.LastName;
        else if(StringHelper.isNullOrEmpty(this.LastName))
            return this.FirstName;
        else
            return this.FirstName+" "+this.LastName;
    }

    @Override
    public boolean IsTitleSet() {
        return this.getTitle() != null;
    }

    @Override
    public boolean IsFirstNameSet() {
        return this.getFirstName() != null;
    }

    @Override
    public boolean IsLastNameSet() {
        return this.getLastName() != null;
    }



    @Override
    public boolean IsGenderSet() {
        return this.getGender() != null;
    }

    @Override
    public int compareTo(Object temp) {
            Person other = (Person) temp;
            /*if(LastName.charAt(0)<((Person)other).LastName.charAt(0))
                return 1;*/
            int i=0;
        while(i<LastName.length() && i<((Person)other).LastName.length()) {

            if(LastName.charAt(i) < ((Person) other).LastName.charAt(i))
                return 1;
            i++;
        }
            i=0;
            while(i<FirstName.length() && i<((Person)other).FirstName.length()) {

                if(FirstName.charAt(i) < ((Person) other).FirstName.charAt(i))
                    return 1;
                i++;
            }
            return -1;


    }


    //endregion
}