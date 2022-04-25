package mylist;

import java.util.Arrays;
import java.util.List;

public class mylist {

	public static void main(String[] args) {
		
		
		//WAP to print all names along with surname from different list.
		
		List<String> s1=Arrays.asList("shwetha","priya","anu");
		List<String> s2=Arrays.asList("Shetty","naidu","sharma");
		
		for(String x:s2) {
			s1.stream().map(i -> i+" "+x).forEach(z -> System.out.println(z));
		}
	}
}
