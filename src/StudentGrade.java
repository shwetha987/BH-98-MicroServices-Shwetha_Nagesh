



class Student1{
	private int rollno;
	private String name;
	private int marks;
	
	Student1(int rollno,String name,int marks){
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public void gradeCalculator() {
		if(this.marks>= 90 && this.marks<=100) {
			System.out.println("Student "+this.name+" scored "+ "Grade-A");
		}else if(this.marks>= 80 && this.marks<=90) {
			System.out.println("Student "+this.name+" scored "+ "Grade-B");
		}else if(this.marks>= 70 && this.marks<=80) {
			System.out.println("Student "+this.name+" scored "+ "Grade-C");
		}else {
			System.out.println("Student "+this.name+" scored "+ "Failed!");
		}
	}
}

public class StudentGrade  {

	public static void main(String[] args) {
		Student1 st = new Student1(101,"Rajesh",78);
		st.gradeCalculator();

	}

}