package com.xworkz.newspaper.dto;

import java.io.Serializable;

public class NewsPaperDTO implements Serializable {

	private String name;
	private int cost;
	private int pages;
	private String author;

	public NewsPaperDTO(String name, int cost, int pages, String author) {
		super();
		this.name = name;
		this.cost = cost;
		this.pages = pages;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "NewsPaperDTO[name = " + name + " cost = " + cost + " pages = " + pages + " author = " + author + "]";
	}
	
	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}
	
	

}
