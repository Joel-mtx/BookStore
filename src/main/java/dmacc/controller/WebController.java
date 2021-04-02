package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Book;
import dmacc.repository.BooksRepository;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 29, 2021
 */
@Controller
public class WebController {
	@Autowired
	BooksRepository repo;
	
	@GetMapping({"/", "/viewAll"})
	public String viewAllBooks(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewBook(model);
		}
		model.addAttribute("book", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputBooks")
	public String addNewBook(Model model) {
		Book b = new Book();
		model.addAttribute("newBook", b);
		return "input";
	}
	
	@PostMapping("/inputBooks")
	public String addNewBook(@ModelAttribute Book b, Model model) {
		repo.save(b);
		return viewAllBooks(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateBook(@PathVariable("id") long id, Model model) {
		Book b = repo.findById(id).orElse(null);
		model.addAttribute("newBook", b);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseBook(Book b, Model model) {
		repo.save(b);
		return viewAllBooks(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBook(@PathVariable("id") long id, Model model) {
		Book b = repo.findById(id).orElse(null);
		repo.delete(b);
		return viewAllBooks(model);
				
	}

}































