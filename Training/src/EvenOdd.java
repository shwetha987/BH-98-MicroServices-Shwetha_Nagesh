import java.util.Scanner;

public class EvenOdd{

  public static void main(String args[])
  {
    //to check whether num is even or odd
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter a number:");
    num = sc.nextInt();

    //If number is divisible by 2 then print it is an even number
    //else  print it as odd number
    if ( num % 2 == 0 )
        System.out.println("The entered number is even");
     else
        System.out.println("The entered number is odd");
  }
}