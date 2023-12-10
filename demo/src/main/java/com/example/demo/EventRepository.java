package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    // Tässä voit määritellä omia metodeja, jos tarvitset, esim. hakuja
}

