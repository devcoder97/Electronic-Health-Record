package com.stackroute.EHR.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.stackroute.EHR.exception.NotFoundException;
import com.stackroute.EHR.model.PatientHealthDetails;
import com.stackroute.EHR.repository.PatientHealthDetailsRepository;


public class PatientHealthDetailsServiceTest {

    @Mock
    private PatientHealthDetailsRepository patientHealthDetailsRepository;

    @InjectMocks
    private PatientHealthDetailsService patientHealthDetailsService;


}

