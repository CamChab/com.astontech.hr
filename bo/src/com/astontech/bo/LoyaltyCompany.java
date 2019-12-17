package com.astontech.bo;

public class LoyaltyCompany extends BaseBO{
    private int LoyaltyCompanyId;
    private String CompanyName;
    private EntityType LoyaltyCompanyType;

    public LoyaltyCompany(){}
    public LoyaltyCompany(int LoyaltyCompanyId){
        this.LoyaltyCompanyId = LoyaltyCompanyId;
    }

    public int getLoyaltyCompanyId() {
        return LoyaltyCompanyId;
    }

    public void setLoyaltyCompanyId(int loyaltyCompanyId) {
        LoyaltyCompanyId = loyaltyCompanyId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public EntityType getLoyaltyCompanyType() {
        return LoyaltyCompanyType;
    }

    public void setLoyaltyCompanyType(EntityType LoyaltyCompanyType) {
        this.LoyaltyCompanyType = LoyaltyCompanyType;
    }

    public String GetLoyaltyCompanyIdAndName(){
        if(this.CompanyName == null)
            return this.LoyaltyCompanyId+", CompanyName not set";
        else
            return this.LoyaltyCompanyId+" "+this.CompanyName;
    }
}