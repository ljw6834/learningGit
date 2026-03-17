package com.aaa.learningGit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

	private final StudentRepository studentRepo;
	private final BookRepository bookRepo;

	public ApiController(StudentRepository studentRepo, BookRepository bookRepo) {
		this.studentRepo = studentRepo;
		this.bookRepo = bookRepo;
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookRepo.findAll();
	}
}
