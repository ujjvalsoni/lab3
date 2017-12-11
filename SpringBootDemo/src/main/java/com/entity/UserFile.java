package com.entity;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class UserFile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer uid;
	private String FileName;
	private String Activity;
	private Integer Star;
	
	public UserFile(){
		//this.id = null;
		this.FileName = null;
		this.Activity = null;
		this.Star = null;
		this.uid = null;
	}
	
	
	public UserFile( String FileName, String Activity, Integer Star, Integer uid){
		//this.id = ID;
		this.FileName = FileName;
		this.Activity = Activity;
		this.Star = Star;
		this.uid = uid;
	}

	public Integer getId() {
		return id;
	}

	public Integer getUid() {
		return uid;
	}


	public void setUid(Integer uid) {
		this.uid = uid;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public String getActivity() {
		return Activity;
	}

	public void setActivity(String activity) {
		Activity = activity;
	}

	public Integer getStar() {
		return Star;
	}

	public void setStar(Integer star) {
		Star = star;
	}

}
