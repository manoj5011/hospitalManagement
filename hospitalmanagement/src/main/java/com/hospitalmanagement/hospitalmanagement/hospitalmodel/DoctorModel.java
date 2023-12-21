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

@Entity(name="Doctors")
@Table(name="Doctors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "doctorSequence")
	@SequenceGenerator(name="doctorSequence",sequenceName = "doctor_Sequence",initialValue = 1,allocationSize = 1)
	@Column(name="empid")
	private Long empid;
	
	@Column(name="doctorsname")
	private String doctorsname;
	
	@Column(name="phoneno")
	private String phoneno;
	
	@Column(name="speciality")
	private String speciality;
	
	@Column(name="timings")
	private String timimgs;


//	public DoctorModel(Long empid, String doctorsname, String phoneno, String speciality, String timimgs) {
//		super();
//		this.empid = empid;
//		this.doctorsname = doctorsname;
//		this.phoneno = phoneno;
//		this.speciality = speciality;
//		this.timimgs = timimgs;
//	}
//	
//	
//
//
//	public Long getEmpid() {
//		return empid;
//	}
//
//
//
//
//	public void setEmpid(Long empid) {
//		this.empid = empid;
//	}
//
//
//
//
//	public String getDoctorsname() {
//		return doctorsname;
//	}
//
//
//
//
//	public void setDoctorsname(String doctorsname) {
//		this.doctorsname = doctorsname;
//	}
//
//
//
//
//	public String getPhoneno() {
//		return phoneno;
//	}
//
//
//
//
//	public void setPhoneno(String phoneno) {
//		this.phoneno = phoneno;
//	}
//
//
//
//
//	public String getSpeciality() {
//		return speciality;
//	}
//
//
//
//
//	public void setSpeciality(String speciality) {
//		this.speciality = speciality;
//	}
//
//
//
//
//	public String getTimimgs() {
//		return timimgs;
//	}
//
//
//
//
//	public void setTimimgs(String timimgs) {
//		this.timimgs = timimgs;
//	}
//
//
//
//
//	@Override
//	public String toString() {
//		return "DoctorModel [emp_id=" + empid + ", doctors_name=" + doctorsname + ", phone_no=" + phoneno
//				+ ", speciality=" + speciality + ", timimgs=" + timimgs + "]";
//	}
//


}
