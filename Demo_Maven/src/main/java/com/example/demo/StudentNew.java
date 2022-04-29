package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="STUDENT1")
public class StudentNew 
{
	@Id @GeneratedValue
	private long id;
	private long marks;
	private String name;
	private String grade;
	
	StudentNew() {}
	
	public StudentNew(long id, long marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentNew other = (StudentNew) obj;
		return id == other.id && marks == other.marks && Objects.equals(name, other.name);
	}
}
