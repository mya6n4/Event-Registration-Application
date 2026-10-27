
package com.ecommerce.eventregistrationbackend.controller;

import com.ecommerce.eventregistrationbackend.entity.EventRegistration;
import com.ecommerce.eventregistrationbackend.repository.EventRegistrationRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "http://localhost:4200")
public class DashboardController {

    private final EventRegistrationRepository repository;

    public DashboardController(EventRegistrationRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/registrations")
    public List<EventRegistration> getRegistrations() {
        return repository.findAll();
    }

    @GetMapping("/total")
    public long getTotalRegistrations() {
        return repository.count();
    }
}
