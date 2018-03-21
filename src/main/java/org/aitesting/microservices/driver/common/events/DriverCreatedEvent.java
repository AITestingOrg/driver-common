package org.aitesting.microservices.driver.common.events;

import java.util.UUID;
import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

@Name("DriverCreatedEvent")
public class DriverCreatedEvent extends Event {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;
    private String currentLocation;
    private String license;
    private boolean available;

    public DriverCreatedEvent(UUID id, String firstName, String lastName, String address, String email, String phone, String currentLocation, String license, boolean available) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.currentLocation = currentLocation;
        this.license = license;
        this.available = available;
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getAddress() { return address; }

    public String getEmail() { return email; }

    public String getPhone() { return phone; }

    public String getCurrentLocation() { return currentLocation; }

    public String getLicense() { return license; }

    public boolean isAvailable() { return available; }
}
