package com.tech.bahaydruti.vidyalaya.rachana.student.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VR_STUDENT")
public class VrStudent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long seq_id;
	@Column(name="profile_id")
	private long profileid;
	
	private Date date_joining;
	private String present_strd;
	private String next_strd;
	private String section;
	private int status;
	
	private Date create_date;

	public long getSeq_id() {
		return seq_id;
	}

	public void setSeq_id(long seq_id) {
		this.seq_id = seq_id;
	}


	public Date getDate_joining() {
		return date_joining;
	}

	public void setDate_joining(Date date_joining) {
		this.date_joining = date_joining;
	}

	public String getPresent_strd() {
		return present_strd;
	}

	public void setPresent_strd(String present_strd) {
		this.present_strd = present_strd;
	}

	public String getNext_strd() {
		return next_strd;
	}

	public void setNext_strd(String next_strd) {
		this.next_strd = next_strd;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public long getProfileid() {
		return profileid;
	}

	public void setProfileid(long profileid) {
		this.profileid = profileid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VrStudent [seq_id=");
		builder.append(seq_id);
		builder.append(", date_joining=");
		builder.append(date_joining);
		builder.append(", present_strd=");
		builder.append(present_strd);
		builder.append(", next_strd=");
		builder.append(next_strd);
		builder.append(", section=");
		builder.append(section);
		builder.append(", status=");
		builder.append(status);
		builder.append(", create_date=");
		builder.append(create_date);
		builder.append("]");
		return builder.toString();
	}

}
