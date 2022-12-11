package com.example.demo.entity;

public class Proposition {
	
	private int id;
	private String title;
	private String fee;
	private String place;
	private String outline;
	private String source_of_information;
	private String url;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getOutline() {
		return outline;
	}
	public void setOutline(String outline) {
		this.outline = outline;
	}
	public String getSource_of_information() {
		return source_of_information;
	}
	public void setSource_of_information(String source_of_information) {
		this.source_of_information = source_of_information;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
