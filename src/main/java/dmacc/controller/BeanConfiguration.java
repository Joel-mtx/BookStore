package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Book;
import dmacc.beans.Store;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 28, 2021
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Book book() {
		Book bean = new Book("The Bible");
		return bean;
	}
	
	@Bean
	public Store location() {
		Store bean = new Store("UniversityBooks", "BB5678", "123 Univerity Ave", "Urbandale", "IA", "50123");
		return bean;
		
	}

}
