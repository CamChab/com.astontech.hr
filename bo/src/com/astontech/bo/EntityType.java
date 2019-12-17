package com.astontech.bo;

public class EntityType extends BaseBO{

    //region PROPERTIES
    private int EntityTypeId;
    private String EntityTypeName;
   // private int EntityId;
    //endregion

    //region CONSTRUCTORS
    public EntityType(){}
    public EntityType(int EntityTypeId){
        this.EntityTypeId = EntityTypeId;
    }
    public EntityType(String EntityTypeName){
        this.EntityTypeName = EntityTypeName;
    }
    //endregion

    //region GETTERS
    public int getEntityTypeId() {
        return EntityTypeId;
    }

    public void setEntityTypeId(int entityTypeId) {
        EntityTypeId = entityTypeId;
    }

    public String getEntityTypeName() {
        return EntityTypeName;
    }

    public void setEntityTypeName(String entityTypeName) {
        EntityTypeName = entityTypeName;
    }

   /* public int getEntityId() {
        return EntityId;
    }

    public void setEntityId(int entityId) {
        EntityId = entityId;
    }*/
    //endregion

}
