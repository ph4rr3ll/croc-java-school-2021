package ru.croc.java.home2.event;

import java.time.LocalDateTime;

public class ClearBoxEvent {
    private final LocalDateTime dateTime;
    private final String description;

    public ClearBoxEvent(LocalDateTime dateTime, String description) {
        this.dateTime = dateTime;
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }
}
