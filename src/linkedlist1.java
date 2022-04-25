import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist1 {
	
	public static void main(String[] args) {
		
		List<Integer> mylist=new LinkedList<Integer>();
		
		mylist.add(90);
        mylist.add(78);
        mylist.add(23);
        mylist.add(12);
        
        System.out.println(mylist);
        
       mylist.remove(3);
       System.out.println(mylist);
       Iterator itr=mylist.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
	}

}
