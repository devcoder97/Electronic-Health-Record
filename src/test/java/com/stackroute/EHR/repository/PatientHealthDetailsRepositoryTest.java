package com.stackroute.EHR.repository;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.stackroute.EHR.model.Medication;
import com.stackroute.EHR.model.PatientHealthDetails;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.DataIntegrityViolationException;

@DataJpaTest
public class PatientHealthDetailsRepositoryTest {

    @Autowired
    private PatientHealthDetailsRepository patientHealthDetailsRepository;




}

