package com.ecommerce.eventregistrationbackend.repository;

import com.ecommerce.eventregistrationbackend.entity.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRegistrationRepository
        extends JpaRepository<EventRegistration, Long> {
}