package org.aitesting.microservices.driver.common.events;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

import java.util.UUID;

@Name("DriverEnabledEvent")
public class DriverEnabledEvent extends Event {

    public DriverEnabledEvent(UUID id) { super(id); }
}
