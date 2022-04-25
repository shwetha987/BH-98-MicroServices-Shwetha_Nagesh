import java.util.ArrayList;
import java.util.List;

public class employee {



private int id;
private String name;
private double salary;
private double commision;
private String designation;



public employee(int id, String name, double salary, double commision, String designation) {
super();
this.id = id;
this.name = name;
this.salary = salary;
this.commision = commision;
this.designation = designation;
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



public double getSalary() {
return salary;
}



public void setSalary(double salary) {
this.salary = salary;
}



public double getCommision() {
return commision;
}



public void setCommision(double commision) {
this.commision = commision;
}



public String getDesignation() {
return designation;
}



public void setDesignation(String designation) {
this.designation = designation;
}



static double bounsCalculator(employee emp) {
if (emp.getDesignation().equals("Manager")) {
return (emp.getSalary() * 30) / 100;
} else if (emp.getDesignation().equals("Lead")) {
return (emp.getSalary() * 25) / 100;
} else {
return (emp.getSalary() * 20) / 100;
}
}



public static void main(String[] args) {

List<employee>mylist=new ArrayList<employee>();

employee emp1 = new employee(101, "shwetha", 50000, 2000, "Manager");
employee emp2 = new employee(102, "swathi", 20000, 1000, "Lead");
employee emp3 = new employee(103, "srikanth", 30000, 1500, "Associate");

mylist.add(emp1);
mylist.add(emp2);
mylist.add(emp3);

for(employee emp:mylist) {
	System.out.println(emp.id+" "+emp.name+" "+emp.salary+" "+emp.commision+" "+emp.designation);
}
/*System.out.println(bounsCalculator(emp1) + emp1.getSalary() + emp1.getCommision());
System.out.println(bounsCalculator(emp2) + emp2.getSalary() + emp2.getCommision());
System.out.println(bounsCalculator(emp3) + emp3.getSalary() + emp3.getCommision());
*/

}



}