package com.stackroute.EHR.repository;

import com.stackroute.EHR.model.Medication;
import com.stackroute.EHR.model.PatientHealthDetails;
import com.stackroute.EHR.model.Vaccination;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class VaccinationRepositoryTest {
    @Autowired
    private VaccinationRepository vaccinationRepository;

}
