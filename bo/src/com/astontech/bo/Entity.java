package com.astontech.bo;

public class Entity extends BaseBO{
    private int EntityId;
    private String EntityName;

    public Entity(){}
    public Entity(int EntityId){
        this.EntityId = EntityId;
    }

    public int getEntityId() {
        return EntityId;
    }

    public void setEntityId(int entityId) {
        EntityId = entityId;
    }

    public String getEntityName() {
        return EntityName;
    }

    public void setEntityName(String entityName) {
        EntityName = entityName;
    }

    public String GetEntityIdAndName(){
        if(this.EntityName == null)
            return String.valueOf(this.EntityId)+", EntityName not set";
        else
            return String.valueOf(this.EntityId)+", "+this.EntityName;
    }
}
