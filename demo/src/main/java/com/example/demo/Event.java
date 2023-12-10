package com.example.demo;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;
    private String description;
    private LocalDate date;

    private String imageUrl; // Kuvan URL
    private String link;     // Linkki

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }
    // Konstruktorit, getterit ja setterit
}

