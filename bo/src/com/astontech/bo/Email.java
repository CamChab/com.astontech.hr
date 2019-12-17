package com.astontech.bo;

public class Email extends BaseBO{
    //region PROPERTIES
    private int EmailId;
    private String EmailAddress;
    private int EmployeeId;
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

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public EntityType getEmailType() {
        return EmailType;
    }

    public void setEmailType(EntityType EmailType) {
        this.EmailType = EmailType;
    }

    public String getEmailAddressAndEmployeeId(){
        if(this.EmailAddress == null)
            return "This Employee's Email Address is not set";
        else
            return this.EmailAddress+" "+this.EmployeeId;
    }
    //endregion
}
