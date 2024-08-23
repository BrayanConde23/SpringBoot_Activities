package com.riwi.events.controller.impl;

import com.riwi.events.controller.interfaces.IEventsController;
import com.riwi.events.entity.EventsEntity;
import com.riwi.events.services.interfaces.IEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventsController implements IEventsController {
    @Autowired
    IEventsService eventsService;

    @Override
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<EventsEntity> create(
            @RequestBody EventsEntity eventsEntity) {
        if (eventsEntity.getCapacity() <= 0 || eventsEntity.getDate().isBefore(LocalDate.now())) {
            return null;
        }
        return ResponseEntity.ok(eventsService.create(eventsEntity));
    }

    @Override
    @GetMapping("/readAll")
    public List<EventsEntity> readAll() {
        return eventsService.readAll();
    }

    @Override
    @GetMapping("/read")
    public ResponseEntity<EventsEntity> readById(
            @RequestParam String id) {
        try {
            EventsEntity eventFound = eventsService.readById(id);
            return ResponseEntity.ok(eventFound);
        } catch (Exception error) {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable String id) {
        try {
            eventsService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception error) {
            return ResponseEntity.notFound().build();
        }
    }
}
