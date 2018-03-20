package org.aitesting.microservices.driver.common.events;

import java.util.UUID;
import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

@Name("DriverCreatedEvent")
public class DriverCreatedEvent extends Event {

    private String license;
    private boolean available;

    public DriverCreatedEvent(UUID id, String license, boolean available) {
        super(id);
        this.license = license;
        this.available = available;
    }

    public String getLicense() {
        return license;
    }

    public boolean isAvailable() {
        return available;
    }
}
