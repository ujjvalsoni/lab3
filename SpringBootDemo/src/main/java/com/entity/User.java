package com.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

    private String password;

    private String lastname;

    private Integer age;
    
    private String gender;
    
    public User(){
		//this.id = null;
		this.name = null;
		this.email = null;
		this.password = null;
		this.lastname = null;
		this.age = null;
		this.gender = null;
	}
	
	
	public User( String name, String email, String password, String lastname, Integer age, String gender){
		//this.id = ID;
		this.name = name;
		this.email = email;
		this.password = password;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
	}
    
    
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
    
    
    
    


}