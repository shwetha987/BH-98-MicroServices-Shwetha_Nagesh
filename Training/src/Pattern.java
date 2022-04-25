import java.util.*;
public class Pattern {
	   public static void main(String[] args)
	    {
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Enter the number of rows: "); //takes input from user
	 
	    int k = sc.nextInt();
	 
	    for (int i= k-1; i>=0 ; i--)
	    {
	    for (int j=0; j<=i; j++)
	    {
	    System.out.print("*" + " ");
	    }
	    System.out.println();
	    }
	    sc.close();
	    }
	    }

