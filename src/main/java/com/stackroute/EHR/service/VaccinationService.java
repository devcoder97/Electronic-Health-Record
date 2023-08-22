package com.stackroute.EHR.service;

import com.stackroute.EHR.model.Vaccination;
import com.stackroute.EHR.repository.VaccinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationService {
    @Autowired
    private VaccinationRepository vaccinationRepository;

}
