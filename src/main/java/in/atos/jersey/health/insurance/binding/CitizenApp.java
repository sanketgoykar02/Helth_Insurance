package in.atos.jersey.health.insurance.binding;

import java.time.LocalDate;


public class CitizenApp {
	
	private String fullname;
	
	private String email;
	
	private Long phnno;
	
	private String gender;
	
	private Long ssn;
	
	private LocalDate dob;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhnno() {
		return phnno;
	}

	public void setPhnno(Long phnno) {
		this.phnno = phnno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	

}
