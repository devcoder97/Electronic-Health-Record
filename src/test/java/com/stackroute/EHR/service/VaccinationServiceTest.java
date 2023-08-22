package com.stackroute.EHR.service;

import com.stackroute.EHR.exception.NotFoundException;
import com.stackroute.EHR.model.PatientHealthDetails;
import com.stackroute.EHR.model.Vaccination;
import com.stackroute.EHR.repository.PatientHealthDetailsRepository;
import com.stackroute.EHR.repository.VaccinationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class VaccinationServiceTest {
    @Mock
    private VaccinationRepository vaccinationRepository;

    @InjectMocks
    private VaccinationService vaccinationService;

}
