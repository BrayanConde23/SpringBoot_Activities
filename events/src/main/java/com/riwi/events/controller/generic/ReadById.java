package com.riwi.events.controller.generic;

import org.springframework.http.ResponseEntity;

public interface ReadById<Entity, ID> {
    public ResponseEntity<Entity> readById(ID id);
}
