package com.astontech.bo;

public class LoyaltyAccount extends BaseBO{
    private int LoyaltyAccountId;
    private LoyaltyCompany LoyaltyCompany;
    private Employee AccountEmployee;
    private int MemberNumber;

    public LoyaltyAccount(){}
    public LoyaltyAccount(int LoyaltyAccountId){
        this.LoyaltyAccountId = LoyaltyAccountId;
    }

    public int getLoyaltyAccountId() {
        return LoyaltyAccountId;
    }

    public void setLoyaltyAccountId(int loyaltyAccountId) {
        LoyaltyAccountId = loyaltyAccountId;
    }

    public LoyaltyCompany getLoyaltyCompany() {
        return LoyaltyCompany;
    }

    public void setLoyaltyCompany(LoyaltyCompany loyaltyCompany) {
        this.LoyaltyCompany = loyaltyCompany;
    }

    public Employee getAccountEmployee() {
        return AccountEmployee;
    }

    public void setAccountEmployee(Employee AccountEmployee) {
        this.AccountEmployee = AccountEmployee;
    }

    public int getMemberNumber() {
        return MemberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        MemberNumber = memberNumber;
    }
}
