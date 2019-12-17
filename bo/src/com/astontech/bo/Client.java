package com.astontech.bo;

import java.util.Date;

public class Client extends BaseBO{
    private int ClientId;
    private String ClientName;
    private Date ClientDate;

    public Client(){}
    public Client(int id){
        this.ClientId =id;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public Date getClientDate() {
        return ClientDate;
    }

    public void setClientDate(Date clientDate) {
        ClientDate = clientDate;
    }
}
