package org.aitesting.microservices.driver.common.events;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

import java.util.UUID;

@Name("DriverDisabledEvent")
public class DriverAvailabilityChangedEvent extends Event {

    private boolean available;

    public DriverAvailabilityChangedEvent(UUID id, boolean available) {
        super(id);
        this.available = available;
    }
}
