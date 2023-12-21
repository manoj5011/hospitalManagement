package com.hospitalmanagement.hospitalmanagement.hopitalservice;

import com.hospitalmanagement.hospitalmanagement.hospitalmodel.DoctorModel;

public interface DoctorService {
	
	public String postDoctorData(DoctorModel doctorData);
	
	public DoctorModel getDoctorData(Long  id);
	
	public String updateDoctorData(Long id,DoctorModel doctorData);

	public String deleteDoctorData(Long  id);
	
	public String getDoctorName(Long id) ;
}
