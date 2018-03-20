package org.aitesting.microservices.driver.common.events;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

import java.util.UUID;

@Name("DriverDisabledEvent")
public class DriverDisabledEvent extends Event {

    public DriverDisabledEvent(UUID id) {
        super(id);
    }
}
