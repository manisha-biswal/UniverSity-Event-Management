package com.geekster.project.assignment.UniversityEventManagement.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Event")
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer eventId;
    private String eventName;
    private String locationOfEvent;
    private LocalDate eventDate;
    private LocalTime startTime;
    private LocalTime endTime;

}
