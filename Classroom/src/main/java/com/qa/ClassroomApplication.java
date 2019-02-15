package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qa.persistence.domain.Classroom;
import com.qa.persistence.repository.ClassroomRepository;

@SpringBootApplication
public class ClassroomApplication {
	private static final Logger log = LoggerFactory.getLogger(ClassroomApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ClassroomApplication.class, args);
	}
	
	
}

