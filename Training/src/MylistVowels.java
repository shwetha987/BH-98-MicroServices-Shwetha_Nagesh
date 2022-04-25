import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MylistVowels {
	
	public static void main(String[] args) {
		
		List<String> l1=Arrays.asList("shwetha","anu","Priya");
		
		List<Character> vow=Arrays.asList('a','e','i','o','u');
		
	l1.stream().filter(x -> vow.contains(x.charAt(0))).forEach(y -> System.out.println(y));
		
		
		
		
	}

}
