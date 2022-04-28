package java8Features;
import java.util.Arrays;
import java.util.List;

public class mylist2 {
	
	public static void main(String[] args) {
		
		
		//WAP to print all names along with surname "Shetty"
		
		List<String> l1=Arrays.asList("shwetha","anu","priya");
		List<String> l2=Arrays.asList("shetty");
		
		for(String x:l2) {
		l1.stream().map(y -> y+" "+x).forEach(z ->System.out.println(z));
		}
	}
	

}
