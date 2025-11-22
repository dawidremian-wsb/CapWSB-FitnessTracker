package pl.wsb.fitnesstracker.event;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="Event")

public class Event {
    @Id
    private int id;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
    private String city;
    private String country;
    private String description;
    private String name;

}


