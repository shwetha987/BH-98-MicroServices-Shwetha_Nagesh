
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {

	 public static void main(String[] args) {
		
		List<Integer>arrlist=new ArrayList<Integer>();
		 arrlist.add(20);
		 arrlist.add(30);
		 arrlist.add(10);
		 arrlist.add(80);
		 System.out.println(arrlist);
		 Collections.sort(arrlist);
		 System.out.println(arrlist);
		 for(int i=0; i< arrlist.size(); i++)
		      System.out.println(arrlist.get(i));
		 
	}
}
