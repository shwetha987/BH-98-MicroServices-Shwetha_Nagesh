import java.util.LinkedList;
import java.util.List;

class StudentInfo {
int roll_no;
String name;
String grade;
public Object getGrade;



public StudentInfo(int roll_no, String name, String grade) {
this.roll_no = roll_no;
this.name = name;
this.grade = grade;
}



public int getRoll_no() {
return roll_no;
}



public void setRoll_no(int roll_no) {
this.roll_no = roll_no;
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



public String getGrade() {
return grade;
}



public void setGrade(String grade) {
this.grade = grade;
}

}
class StudentCollection
{
public static void collection(StudentInfo stu1)
{
if(stu1.getGrade().equals("A") ||stu1.getGrade().equals("B"))
{
System.out.println(stu1.roll_no+" " + stu1.name +" " + stu1.grade);
}



}
public static void main(String[] args) {
	
	List<StudentInfo>mylist=new LinkedList<StudentInfo>();
	
	
StudentInfo stud1 = new StudentInfo( 101, "Tommy", "A");
StudentInfo stud2 = new StudentInfo( 102, "John", "A");
StudentInfo stud3 = new StudentInfo( 103, "Sam", "B");
StudentInfo stud4 = new StudentInfo( 104, "Rajeev","C");
StudentInfo stud5 = new StudentInfo(105,"Suraj", "D");

mylist.add(stud1);
mylist.add(stud2);
mylist.add(stud3);
mylist.add(stud4);
mylist.add(stud5);


for(StudentInfo sd:mylist) {
	System.out.println(sd.roll_no+" "+sd.name+" "+sd.grade);
}

/*collection(stu1);
collection(stu2);
collection(stu3);
collection(stu4);
collection(stu5);
*/

}
}