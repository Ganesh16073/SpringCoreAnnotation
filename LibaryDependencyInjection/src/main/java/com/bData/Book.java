package com.bData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

	@Value("GYM")
	private String title;
	@Value("Development")
	private String genre;
	
	
	Author au;

	@Autowired
	public Book(Author au)
	{
		this.au=au;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", genre=" + genre + ", au=" + au + ", getTitle()=" + getTitle()
				+ ", getGenre()=" + getGenre() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
