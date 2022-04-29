package com.example.demo;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentNewController 
{
	@Autowired
	StudentService studentService;
	
	private final StudentRepository studentRepository;
	public StudentNewController(StudentRepository studentRepository) 
	{
		this.studentRepository = studentRepository;
	}
	@PostMapping("/students")
	StudentNew save(@RequestBody StudentNew student)
	{
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/students")
	List<StudentNew> getAll()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("/students/{id}")
	Optional<StudentNew> getOneStudent(@PathVariable Long id)
	{
		return studentService.getOneStudent(id);
	}
	
	@DeleteMapping("/student/{id}")
	void deleteOneStudent(@PathVariable Long id)
	{
		studentService.deleteStudent(id);
	}
}