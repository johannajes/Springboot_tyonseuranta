package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/")
    public String showEventList(Model model) {
        model.addAttribute("events", eventRepository.findAll());
        return "eventList";
    }

    @PostMapping("/{id}/addImageUrl")
    public ResponseEntity<Event> addImageUrl(@PathVariable Long id, @RequestBody String imageUrl) {
        Event event = eventRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Event not found"));

        event.setImageUrl(imageUrl);
        eventRepository.save(event);
        return ResponseEntity.ok(event);
    }

    @PostMapping("/{id}/addLink")
    public ResponseEntity<Event> addLink(@PathVariable Long id, @RequestBody String link) {
        Event event = eventRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Event not found"));

        event.setLink(link);
        eventRepository.save(event);
        return ResponseEntity.ok(event);
    }

    // Lisää muita metodeja tarpeen mukaan (esim. lisäys, muokkaus, poisto)
}

