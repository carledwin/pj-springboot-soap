package com.carledwinti.springboot.soap.model;

import com.carledwinti.springboot.soap.enums.DocumentType;

public class User {

	private String name;
	private Integer age;
	private Long document;
	private DocumentType documentType;
	
	public User() {
		super();
	}

	public User(String name, Integer age, Long document, DocumentType documentType) {
		super();
		this.name = name;
		this.age = age;
		this.document = document;
		this.documentType = documentType;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", document=" + document + ", documentType=" + documentType
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getDocument() {
		return document;
	}

	public void setDocument(Long document) {
		this.document = document;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

		
}
