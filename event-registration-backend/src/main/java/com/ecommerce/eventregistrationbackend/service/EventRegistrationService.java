
package com.ecommerce.eventregistrationbackend.service;

import com.ecommerce.eventregistrationbackend.entity.EventRegistration;
import com.ecommerce.eventregistrationbackend.repository.EventRegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class EventRegistrationService {

    private final EventRegistrationRepository eventRegistrationRepository;

    public EventRegistrationService(
            EventRegistrationRepository eventRegistrationRepository) {
        this.eventRegistrationRepository = eventRegistrationRepository;
    }

    public EventRegistration registerEvent(EventRegistration registration) {
        return eventRegistrationRepository.save(registration);
    }
}
