package java8Features;
import java.util.*;

class Demo implements Runnable{
	
	  public void run() {
		  
		  for(int i=0; i<=2;i++) {
			  System.out.println("threads");
		  }
	  }
	   
	  
}

public class RunnableLambda {
	

	
	public static void main(String[] args) {
		
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		
		Thread t=new Thread(d1);
		Thread t1=new Thread(d2);
		Thread t2=new Thread(d3);
		
		
		t.start();
		
		System.out.println("thread1...is running");	
		t1.start();
		System.out.println("thread2....is running");
			t2.start();
			System.out.println("thread3...is running");	
	}

}
