package com.stackroute.EHR.service;
import com.stackroute.EHR.exception.NotFoundException;
import com.stackroute.EHR.model.PatientHealthDetails;
import com.stackroute.EHR.repository.PatientHealthDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientHealthDetailsService {
    //Autowire the PatiendHealthDetailsRepository here
    @Autowired
    private PatientHealthDetailsRepository patiendHealthDetailsRepository;

}
