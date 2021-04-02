package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 28, 2021
 */
@Data
@Entity
@NoArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	private String title;
	private String author;
	private String genre;
	@Autowired
	private Store location;
	
	public Store getLocation() {
		return location;
	}
	public void setLocation(Store location) {
		this.location = location;
	}

	public Book(String title) {
		super();
		this.title = title;
	}
	public Book(String title, String author, String genre) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
	}
	public Book(long id, String title, String author, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
	}
	}
