package com.hospitalmanagement.hospitalmanagement.hospitalmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Patients")
@Setter@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PatientModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "patientSequence")
	@SequenceGenerator(name="patientSequence",allocationSize = 1)
	@Column(name="PatientId")
	private Long PatientId;
	
	@Column(name="PatientName")
	private String PatientName;

	@Column(name="PatientPhoneNo")
	private String PatientPhoneNo;

	@Column(name="ConsultingDoctor")
	private String ConsultingDoctor;
	
	@Column(name="ConsultingDoctorId")
	private String ConsultingDoctorId;

	@Column(name="Remarks")
	private String Remarks;

//	public PatientModel(String patientId, String patientName, String patientPhoneNo, String consultingDoctor,
//			String remarks) {
//		super();
//		PatientId = patientId;
//		PatientName = patientName;
//		PatientPhoneNo = patientPhoneNo;
//		ConsultingDoctor = consultingDoctor;
//		Remarks = remarks;
//	}
//
//	public String getPatientId() {
//		return PatientId;
//	}
//
//	public void setPatientId(String patientId) {
//		PatientId = patientId;
//	}
//
//	public String getPatientName() {
//		return PatientName;
//	}
//
//	public void setPatientName(String patientName) {
//		PatientName = patientName;
//	}
//
//	public String getPatientPhoneNo() {
//		return PatientPhoneNo;
//	}
//
//	public void setPatientPhoneNo(String patientPhoneNo) {
//		PatientPhoneNo = patientPhoneNo;
//	}
//
//	public String getConsultingDoctor() {
//		return ConsultingDoctor;
//	}
//
//	public void setConsultingDoctor(String consultingDoctor) {
//		ConsultingDoctor = consultingDoctor;
//	}
//
//	public String getRemarks() {
//		return Remarks;
//	}
//
//	public void setRemarks(String remarks) {
//		Remarks = remarks;
//	}
//
//	@Override
//	public String toString() {
//		return "PatientModel [PatientId=" + PatientId + ", PatientName=" + PatientName + ", PatientPhoneNo="
//				+ PatientPhoneNo + ", ConsultingDoctor=" + ConsultingDoctor + ", Remarks=" + Remarks + "]";
//	}
//	

}
