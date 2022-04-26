package java8Features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class PrintNames {

	public static void main(String[] args) {
		
		
		List<String> mylist=Arrays.asList("shwetha","anu","priya");
		List<String> mylist1=Arrays.asList("shetty");
		
	//	mylist.addAll(mylist1);
		
		List<String> conc=new ArrayList<String>();
		
		//conc=Stream.concat(mylist.stream(), mylist1.stream()).collect(Collectors.toList());
		
		for ( String x:mylist){
		    for (String y: mylist1){
		    	
		    	System.out.println(x+" "+y);
		    	
		    //	System.out.println(y);
		    }
		 
		
	System.out.println(mylist);
		
		
		
	
	}

}
}