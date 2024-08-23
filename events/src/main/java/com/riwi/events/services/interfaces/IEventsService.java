package com.riwi.events.services.interfaces;

import com.riwi.events.entity.EventsEntity;
import com.riwi.events.services.CRUD.Create;
import com.riwi.events.services.CRUD.Delete;
import com.riwi.events.services.CRUD.ReadAll;
import com.riwi.events.services.CRUD.ReadById;

public interface IEventsService extends
        Create<EventsEntity>,
        ReadAll<EventsEntity>,
        ReadById<EventsEntity, String>,
        Delete<String> {

}
