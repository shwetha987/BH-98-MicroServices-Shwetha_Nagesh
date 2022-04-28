package com.example.demo;



import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class StudentNewController {
	
private final StudentRepository studentRepository;
	
	StudentNewController(StudentRepository studentRepository){
		this.studentRepository=studentRepository;
	}

	@GetMapping("/students")
	List<StudentNew> getAll(){
		return studentRepository.findAll();
		

	}
}


