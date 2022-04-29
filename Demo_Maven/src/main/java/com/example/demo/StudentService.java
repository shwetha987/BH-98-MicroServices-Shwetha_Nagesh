package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
	@Autowired
	StudentRepository studentRepository;
	
	public StudentNew saveStudent(StudentNew studentNew)
	{
		if(studentNew.getMarks()>100)
			studentNew.setGrade("I");
		else if(studentNew.getMarks()>=90)
			studentNew.setGrade("A");
		else if(studentNew.getMarks()>=80)
			studentNew.setGrade("B");
		else if(studentNew.getMarks()>=70)
			studentNew.setGrade("C");
		else
			studentNew.setGrade("F");
		return studentRepository.save(studentNew);
	}
	public void deleteStudent(Long id) 
	{
		studentRepository.deleteById(id);
	}
	public Optional<StudentNew> getOneStudent(Long id) {

		return studentRepository.findById(id);
	}
}


