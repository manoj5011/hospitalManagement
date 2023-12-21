package com.hospitalmanagement.hospitalmanagement.hopitalrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalmanagement.hospitalmanagement.hospitalmodel.PatientModel;

public interface PatientRepository extends JpaRepository<PatientModel, Long> {


	
	
}
