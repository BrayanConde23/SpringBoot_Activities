package com.riwi.events.services.CRUD;

public interface ReadById<Entity, ID> {
    public Entity readById(ID id);
}
