package com.riwi.events.controller.interfaces;

import com.riwi.events.controller.generic.Create;
import com.riwi.events.controller.generic.Delete;
import com.riwi.events.controller.generic.ReadAll;
import com.riwi.events.controller.generic.ReadById;
import com.riwi.events.entity.EventsEntity;

public interface IEventsController extends
        Create<EventsEntity>,
        ReadAll<EventsEntity>,
        ReadById<EventsEntity, String>,
        Delete<String> {

}
