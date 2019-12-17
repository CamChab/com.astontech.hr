package com.astontech.bo;

public class ClientContact extends BaseBO{
    private int ClientContactId;
    private Client ClientId;
    private int EntityTypeId;

    public ClientContact(){}
    public ClientContact(int ClientContactId){
        this.ClientContactId = ClientContactId;
    }

    public int getClientContactId() {
        return ClientContactId;
    }

    public void setClientContactId(int clientContactId) {
        ClientContactId = clientContactId;
    }

    public Client getClientId() {
        return ClientId;
    }

    public void setClientId(Client clientId) {
        ClientId = clientId;
    }

    public int getEntityTypeId() {
        return EntityTypeId;
    }

    public void setEntityTypeId(int entityTypeId) {
        EntityTypeId = entityTypeId;
    }
}
