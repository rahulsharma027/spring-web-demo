package com.cisco.beans;

import java.time.LocalDate;

public class Profile {
	private int id;
	private String name;
	private LocalDate dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	public Profile(int id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public Profile() {
		super();
	}
	
}
