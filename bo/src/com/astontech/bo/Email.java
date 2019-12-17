package com.astontech.bo;

public class Email extends BaseBO{
    //region PROPERTIES
    private int EmailId;
    private String EmailAddress;
    private Employee Employee;
    private EntityType EmailType;
    //endregion
    //region CONSTRUCTORS
    public Email(){}
    public Email(String EmailAddress){
        this.EmailAddress = EmailAddress;
    }
    //endregion
    //region GETTERS / SETTERS
    public int getEmailId() {
        return EmailId;
    }

    public void setEmailId(int emailId) {
        EmailId = emailId;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public Employee getEmployee() {
        return Employee;
    }

    public void setEmployee(Employee Employee) {
        this.Employee = Employee;
    }

    public EntityType getEmailType() {
        return EmailType;
    }

    public void setEmailType(EntityType EmailType) {
        this.EmailType = EmailType;
    }

    public String getEmailAddressAndEmployee(){
        if(this.EmailAddress == null)
            return "This Employee's Email Address is not set";
        else
            return this.EmailAddress+" "+this.Employee;
    }
    //endregion
}
