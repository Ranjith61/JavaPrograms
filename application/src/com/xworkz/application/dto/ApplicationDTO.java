package com.xworkz.application.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {

	private int id;
	private String name;
	private String developedAt;
	private String version;

	public ApplicationDTO(int id, String name, String developedAt, String version) {
		super();
		this.id = id;
		this.name = name;
		this.developedAt = developedAt;
		this.version = version;
	}

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

	public String getDevelopedAt() {
		return developedAt;
	}

	public void setDevelopedAt(String developedAt) {
		this.developedAt = developedAt;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [id=" + id + ", name=" + name + ", developedAt=" + developedAt + ", version=" + version
				+ "]";
	}

}
