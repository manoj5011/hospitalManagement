package com.hospitalmanagement.hospitalmanagement.hopitalrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hospitalmanagement.hospitalmanagement.hospitalmodel.DoctorModel;

public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {

	@Query(value="select doctorsname,phoneno from Doctors where empid=?1")
	String getDoctorsName(Long id);

}
