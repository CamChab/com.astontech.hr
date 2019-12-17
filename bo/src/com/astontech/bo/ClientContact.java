package com.astontech.bo;

public class ClientContact extends BaseBO{
    private int ClientContactId;
    private Client Client;
    private EntityType ClientContactType;

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
        return Client;
    }

    public void setClientId(Client Client) {
        this.Client = Client;
    }

    public EntityType getClientContactType() {
        return ClientContactType;
    }

    public void setClientContactType(EntityType ClientContactType) {
        this.ClientContactType = ClientContactType;
    }
}
