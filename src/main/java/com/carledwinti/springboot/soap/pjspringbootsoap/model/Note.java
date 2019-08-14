package com.carledwinti.springboot.soap.pjspringbootsoap.model;

public class Note {

	private String description;
	private Integer value;
	private User user;
	
	public Note() {
		super();
	}
	
	public Note(String description, Integer value, User user) {
		super();
		this.description = description;
		this.value = value;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Note [description=" + description + ", value=" + value + ", user=" + user + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
