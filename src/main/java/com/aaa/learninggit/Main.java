package com.aaa.learningGit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Bean
	CommandLineRunner init(StudentRepository studentRepo, BookRepository bookRepo) {
		return args -> {
			Student student = new Student();
			student.setName("Alice");
			studentRepo.save(student);
			System.out.println("Saved Student: " + student.getName() + " (ID: " + student.getId() + ")");

			Book book = new Book();
			book.setTitle("Spring Boot in Action");
			bookRepo.save(book);
			System.out.println("Saved Book: " + book.getTitle() + " (ID: " + book.getId() + ")");

			System.out.println("All Students: " + studentRepo.findAll());
			System.out.println("All Books: " + bookRepo.findAll());
		};
	}
}
