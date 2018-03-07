package com.ef.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class LogData {
	
	@Id @GeneratedValue
	private Long id;
	
	private Calendar date;
	private String ip;
	private String request;
	private String status;
	private String userAgent;
	
	public LogData(Calendar date, String ip, String request, String status, String userAgent) {
		super();
		this.date = date;
		this.ip = ip;
		this.request = request;
		this.status = status;
		this.userAgent = userAgent;
	}
	public Calendar getDate() {
		return date;
	}
	public String getIp() {
		return ip;
	}
	public String getRequest() {
		return request;
	}
	public String getStatus() {
		return status;
	}
	public String getUserAgent() {
		return userAgent;
	}
	
	
	

}
