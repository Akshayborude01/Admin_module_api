package com.spring.user.binding;

import java.time.LocalDate;

public class AdminAccountData {

	private String fname;
	private String email;
	private long moNo;
	private String gender;
	private LocalDate dob;
	private long ssn;
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the moNo
	 */
	public long getMoNo() {
		return moNo;
	}
	/**
	 * @param moNo the moNo to set
	 */
	public void setMoNo(long moNo) {
		this.moNo = moNo;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	/**
	 * @return the ssn
	 */
	public long getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "AdminAccountData [fname=" + fname + ", email=" + email + ", moNo=" + moNo + ", gender=" + gender
				+ ", dob=" + dob + ", ssn=" + ssn + "]";
	}
	public AdminAccountData(String fname, String email, long moNo, String gender, LocalDate dob, long ssn) {
		super();
		this.fname = fname;
		this.email = email;
		this.moNo = moNo;
		this.gender = gender;
		this.dob = dob;
		this.ssn = ssn;
	}
	public AdminAccountData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
