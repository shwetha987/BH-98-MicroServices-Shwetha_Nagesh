
public class ThreadLambda {
	
	public static void main(String[] args) {
		
		{
	        Runnable b = () ->
	        {
	 
	            String threadName
	                = Thread.currentThread().getName();
	            System.out.println("Running the threads "
	                               + threadName);
	        };
	 
	      
	        Thread t1 = new Thread(b);
	        Thread t2 = new Thread(b);
	        Thread t3 = new Thread(b);
	 
	      
	        t1.start();
	        t2.start();
	        t3.start();
	    }
	}
	}


