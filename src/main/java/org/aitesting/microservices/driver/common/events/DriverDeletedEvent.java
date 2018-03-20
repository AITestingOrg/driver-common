package org.aitesting.microservices.driver.common.events;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

import java.util.UUID;

@Name("DriverDeletedEvent")
public class DriverDeletedEvent extends Event {

    public DriverDeletedEvent(UUID id) {
        super(id);
    }
}
