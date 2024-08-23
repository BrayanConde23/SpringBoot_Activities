package com.riwi.events.respository.interfaces;

import com.riwi.events.entity.EventsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<EventsEntity, String> {
}
