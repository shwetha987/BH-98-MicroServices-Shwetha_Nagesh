package java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;




class Department {
	
  private int dept_id;
  private String dept_name;
  
  public Department(int dept_id, String dept_name) {
	super();
	this.dept_id = dept_id;
	this.dept_name = dept_name;
}

  public int getDept_id() {
	return dept_id;
}

 public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}

 public String getDept_name() {
	return dept_name;
}

 public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}

 @Override
 public String toString() {
	return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
}



}


	class Student3 {
	
	private int id;
	private String name;
	private Department dept;
	private int cmarks,pmarks,mmarks;
	

    public Student3(int id, String name, Department dept, int cmarks, int pmarks, int mmarks) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.cmarks = cmarks;
	this.pmarks = pmarks;
	this.mmarks = mmarks;
 }
    public int getId() {
    	return id;
  }
    public void setId(int id) {
    	this.id = id;
}
    public String getName() {
    	return name;
}
    public void setName(String name) {
    	this.name = name;
}
    public Department getDept() {
    	return dept;
}
    public void setDept(Department dept) {
    	this.dept = dept;
}
    public int getCmarks() {
    	return cmarks;
}
    public void setCmarks(int cmarks) {
    	this.cmarks = cmarks;
}
    public int getPmarks() {
    	return pmarks;
}
    public void setPmarks(int pmarks) {
    	this.pmarks = pmarks;
}
    public int getMmarks() {
    	return mmarks;
}
    public void setMmarks(int mmarks) {
    	this.mmarks = mmarks;
}
    public int getMarks() {
    	return mmarks + pmarks + cmarks;
}
    @Override
    public String toString() {
    	return "Student3 [id=" + id + ", name=" + name + ", dept=" + dept + ", cmarks=" + cmarks + ", pmarks=" + pmarks
+ ", mmarks=" + mmarks + "]";
}
	public static Stream<Student3> stream() {
		// TODO Auto-generated method stub
		return null;
	}

}

public class StudentDep {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Department d1 = new Department(123,"ECE");
		Department d2 = new Department(234,"CS");
		Department d3 = new Department(345,"BIO");



		Student3 s1 = new Student3(201,"shwetha",d1,90,95,93);
		Student3 s2 = new Student3(202,"anu",d2,87,95,93);
		Student3 s3 = new Student3(203,"bindu",d3,66,95,78);
		Student3 s4 = new Student3(204,"vinay",d2,79,95,93);
		Student3 s5 = new Student3(205,"geetha",d3,90,78,93);
		Student3 s6 = new Student3(206,"sri",d2,90,95,93);
		Student3 s7 = new Student3(207,"jay",d1,83,67,93);



		List<Student3> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		Map<Department, List<Student3>> studentDeptWise = students.stream().collect(Collectors.groupingBy(Student3::getDept));



		System.out.println(studentDeptWise);


		//Optional<Student3> maxmarks = Student3.stream() .collect(Collectors.maxBy(Comparator.comparing(Student3::cmarks)));

	}



}