package com.tech.bahaydruti.vidyalaya.rachana.student.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VR_PROFILE")
public class VrProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long seq_id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="gender")
	private String gender;
	@Column(name="adhaar_no")
	private String adhaarNo;
	@Column(name="status")
	private int status;
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	@Column(name="create_date")
	private Date create_date;
	public long getSeq_id() {
		return seq_id;
	}
	public void setSeq_id(long seq_id) {
		this.seq_id = seq_id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VrProfile [seq_id=");
		builder.append(seq_id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", adhaarNo=");
		builder.append(adhaarNo);
		builder.append(", status=");
		builder.append(status);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", create_date=");
		builder.append(create_date);
		builder.append("]");
		return builder.toString();
	}
	

}
