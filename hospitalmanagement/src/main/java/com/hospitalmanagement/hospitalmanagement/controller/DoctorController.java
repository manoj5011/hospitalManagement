package com.hospitalmanagement.hospitalmanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.hospitalmanagement.hopitalservice.DoctorServiceImpl;
import com.hospitalmanagement.hospitalmanagement.hospitalmodel.DoctorModel;

@RestController
@RequestMapping(path = "/hospitalmanagement")
public class DoctorController {
	Logger logger = LoggerFactory.getLogger(DoctorController.class);

	@Autowired
	private DoctorServiceImpl DoctorServiceImpl;

	@GetMapping(path = "/test")
	public String test() {
		logger.info("DoctorController-Welcome to hospital management application");
		return "DoctorController-Welcome to hospital management application";
	}

	@RequestMapping(value = { "/postDoctorData", "/test", "/getDoctorData", "/putDoctorData/{id}",
			"/deleteDoctorData/{id}", "/getDoctorname" })
	public ResponseEntity<String> defaultResponse() {
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
				.body("This endpoint does not support the requested method.");
	}

	// post, get, put and delete operations
	@PostMapping(path = "/postDoctorData")
	public ResponseEntity<String> postDoctors(@RequestBody DoctorModel doctorData) {
		String response = "";
		try {
			logger.info("in postDoctorData controller: " + doctorData.toString());
			response = DoctorServiceImpl.postDoctorData(doctorData);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (Exception ex) {
			logger.info("Exception in postDoctorData: " + ex);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	@GetMapping(path = "/getDoctorData")
	public ResponseEntity<DoctorModel> getDoctors(@RequestParam Long id) {
		DoctorModel response = null;
		try {
			logger.info("in getDoctorData controller: " + id);
			response = DoctorServiceImpl.getDoctorData(id);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (Exception ex) {
			logger.info("Exception in postDoctorData: " + ex);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	@PutMapping(path = "/putDoctorData/{id}")
	public ResponseEntity<String> updateDoctors(@PathVariable(name = "id") Long id,
			@RequestBody DoctorModel doctorData) {
		String response = DoctorServiceImpl.updateDoctorData(id, doctorData);
		return ResponseEntity.status(HttpStatus.OK).body(response);

	}

	@DeleteMapping(path = "/deleteDoctorData/{id}")
	public ResponseEntity<String> deleteDoctors(@PathVariable(name = "id") Long id) {
		String response = DoctorServiceImpl.deleteDoctorData(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);

	}

	@GetMapping(path = "/getDoctorname")
	public ResponseEntity<String> getDoctorsName(@RequestParam Long id) {
		 logger.info("in getDoctorname controller: " + id);
			String	response = DoctorServiceImpl.getDoctorName(id);
			return ResponseEntity.status(HttpStatus.OK).body(response);
}
}
