package com.hospitalmanagement.hospitalmanagement.hopitalservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.hospitalmanagement.hopitalrepository.DoctorRepository;
import com.hospitalmanagement.hospitalmanagement.hospitalmodel.DoctorModel;

@Service
public class DoctorServiceImpl implements DoctorService {

	Logger logger = LoggerFactory.getLogger(DoctorServiceImpl.class);

	@Autowired
	private DoctorRepository DoctorRepository;

	@Override
	public String postDoctorData(DoctorModel doctorData) {
		try {
			DoctorRepository.save(doctorData);
			return "success";
		} catch (Exception ex) {
			logger.info("Exception occured while saving Doctor data " + ex);
			return "Exception occured while saving doctor data";
		}

	}

	public DoctorModel getDoctorData(Long id) {
		return DoctorRepository.findById(id).get();
	}

	@Override
	public String updateDoctorData(Long id, DoctorModel doctorData) {
		try {
			DoctorModel DoctorModel = DoctorRepository.findById(id).get();
			DoctorModel.setDoctorsname(doctorData.getDoctorsname());
			DoctorModel.setPhoneno(doctorData.getPhoneno());
			DoctorModel.setSpeciality(doctorData.getSpeciality());
			DoctorModel.setTimimgs(doctorData.getTimimgs());
			DoctorRepository.save(DoctorModel);
			return "success";
		} catch (Exception ex) {
			logger.info("Exception occured while updating Doctor data " + ex);
			return "Exception occured while updating doctor data";
		}
	}

	public String deleteDoctorData(Long id) {
		try {
			DoctorRepository.deleteById(id);
			return "success";
		}

		catch (Exception ex) {
			logger.info("Exception occured while deleting Doctor data " + ex);
			return "Exception occured while deleting doctor data";
		}

	}

	@Override
	public String getDoctorName(Long id) {
		
		return DoctorRepository.getDoctorsName(id);
		
	}

}
