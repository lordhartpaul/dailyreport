package com.mycoding.dailyreport.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Dailyreport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Past @NotNull
	private Date date;
	
	@NotEmpty 
	private String candidate_name;
	
	@NotNull 
	private int mobile_number;
	
	@Email @NotEmpty
	private String email_id;
	
	@NotEmpty
	private String client;
	
	@NotEmpty
	private String req_name;
	
	@NotNull 
	private int ams_req_id;

	@NotNull 
	private int ams_candidate_id;
	
	@NotNull 
	private int weekday_interview_scheduled;
	
	@NotNull 
	private int weekday_interview_happened;
	
	@NotNull 
	private int weekend_interview_scheduled;
	
	@NotNull 
	private int selects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public int getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getReq_name() {
		return req_name;
	}

	public void setReq_name(String req_name) {
		this.req_name = req_name;
	}

	public int getAms_req_id() {
		return ams_req_id;
	}

	public void setAms_req_id(int ams_req_id) {
		this.ams_req_id = ams_req_id;
	}

	public int getAms_candidate_id() {
		return ams_candidate_id;
	}

	public void setAms_candidate_id(int ams_candidate_id) {
		this.ams_candidate_id = ams_candidate_id;
	}

	public int getWeekday_interview_scheduled() {
		return weekday_interview_scheduled;
	}

	public void setWeekday_interview_scheduled(int weekday_interview_scheduled) {
		this.weekday_interview_scheduled = weekday_interview_scheduled;
	}

	public int getWeekday_interview_happened() {
		return weekday_interview_happened;
	}

	public void setWeekday_interview_happened(int weekday_interview_happened) {
		this.weekday_interview_happened = weekday_interview_happened;
	}

	public int getWeekend_interview_scheduled() {
		return weekend_interview_scheduled;
	}

	public void setWeekend_interview_scheduled(int weekend_interview_scheduled) {
		this.weekend_interview_scheduled = weekend_interview_scheduled;
	}

	public int getSelects() {
		return selects;
	}

	public void setSelects(int selects) {
		this.selects = selects;
	}
	
	
	
	
	

}
