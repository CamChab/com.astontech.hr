package com.astontech.bo;

public class Phone extends BaseBO{
    private int PhoneId;
    private int EntityTypeId;
    private int ClientId;
    private int PersonId;
    private String AreaCode;
    private String PhoneNumber;
    private int PhoneNumberPost;

    public Phone(){}
    public Phone(String PhoneNumber){
        this.PhoneNumber = PhoneNumber;
    }

    public int getPhoneId() {
        return PhoneId;
    }

    public void setPhoneId(int phoneId) {
        PhoneId = phoneId;
    }

    public int getEntityTypeId() {
        return EntityTypeId;
    }

    public void setEntityTypeId(int entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int personId) {
        PersonId = personId;
    }

    public String getAreaCode() {
        return AreaCode;
    }

    public void setAreaCode(String areaCode) {
        this.AreaCode = areaCode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getPhoneNumberPost() {
        return PhoneNumberPost;
    }

    public void setPhoneNumberPost(int phoneNumberPost) {
        PhoneNumberPost = phoneNumberPost;
    }

    public String GetAreaCodeAndPhoneNumber(){
        return this.AreaCode+this.PhoneNumber;
    }
}
