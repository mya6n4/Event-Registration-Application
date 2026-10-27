
package com.ecommerce.eventregistrationbackend.controller;

import com.ecommerce.eventregistrationbackend.entity.EventRegistration;
import com.ecommerce.eventregistrationbackend.service.EventRegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin(origins = "http://localhost:4200")
public class EventRegistrationController {

    private final EventRegistrationService eventRegistrationService;

    public EventRegistrationController(
            EventRegistrationService eventRegistrationService) {
        this.eventRegistrationService = eventRegistrationService;
    }

    @PostMapping
    public ResponseEntity<EventRegistration> registerEvent(
            @RequestBody EventRegistration registration) {

        EventRegistration savedRegistration =
                eventRegistrationService.registerEvent(registration);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedRegistration);
    }
}
