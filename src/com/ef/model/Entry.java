package com.ef.model;

public class Entry {
	
	private String startDate;
	private String duration;
	private String threshold;
	
	public Entry(String startDate, String duration, String threshold) {
		super();
		this.startDate = startDate;
		this.duration = duration;
		this.threshold = threshold;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getDuration() {
		return duration;
	}

	public String getThreshold() {
		return threshold;
	}
	
	

}
