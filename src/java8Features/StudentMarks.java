package java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMarks {

	

	public static void main(String[] args) {
		

		Department d1 = new Department(123,"ECE");
		Department d2 = new Department(234,"CS");
		Department d3 = new Department(345,"IT");
		
		Student3 s1 = new Student3(201,"shwetha",d1,90,95,93);
		Student3 s2 = new Student3(202,"anu",d2,87,95,93);
		Student3 s3 = new Student3(203,"bindu",d3,66,95,78);
		Student3 s4 = new Student3(204,"vinay",d2,79,95,93);
		Student3 s5 = new Student3(205,"geetha",d3,90,78,93);
		Student3 s6 = new Student3(206,"sri",d2,90,95,93);
		Student3 s7 = new Student3(207,"jay",d1,83,67,93);
		
		List<Student3> li=Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		
	//	Map<Department, List<Student3>> studentDeptWise = students.stream().collect(Collectors.groupingBy(Student3::getDept));


		Map<Department, List<Student3>> maxmarks=li.stream().filter(x -> x.getMarks()>85).collect(Collectors.groupingBy(Student3::getDept));
		
		System.out.println(maxmarks);
		
		//Comparator<Student3> comparator = Comparator.comparing( Student3::cmarks );
		
		
		//Student3 max = Student3.stream().max(comparator).get();
		
		/*Optional<Student3> maxmarks = 
	            Student3.stream()
	            .collect(Collectors.maxBy(Comparator.comparing(Student3::cmarks)));*/
		
	/*	Integer maxMarks = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println(maxMarks);
		*/
		
		//Ques2 - give student record who scored maximum marks in his department.



	/*	for(List<Student3> s :studentDeptWise.values() ) {
		Optional<Student3> maxMarksStudent = s.stream().collect(Collectors.maxBy(Comparator.comparing(Student3::getMarks)));
		
		System.out.println(maxMarksStudent);
		}
		*/
	}
}
