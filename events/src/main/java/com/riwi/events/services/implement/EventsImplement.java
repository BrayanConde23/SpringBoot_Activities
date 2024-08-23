package com.riwi.events.services.implement;

import com.riwi.events.entity.EventsEntity;
import com.riwi.events.respository.interfaces.EventsRepository;
import com.riwi.events.services.interfaces.IEventsService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsImplement implements IEventsService {
    @Autowired
    EventsRepository eventsRepository;

    @Override
    public EventsEntity create(EventsEntity eventsEntity) {
        return eventsRepository.save(eventsEntity);
    }

    @Override
    public void delete(String id) {
        eventsRepository.deleteById(id);
    }

    @Override
    public List<EventsEntity> readAll() {
        return eventsRepository.findAll();
    }

    @Override
    public EventsEntity readById(String id) {
        return eventsRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("Event with ID" + "'" + id + "'" + "not found"));
    }
}
