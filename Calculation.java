package core_java;
// Code written by Ayush Singh
//  Program to take input from user and perform sum, sub, mul, div
import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
	    Scanner sc =new Scanner (System.in); //  use scanner class to take input from user
	    System.out.println("Enter the Value of A");
		int a = sc.nextInt();
	    System.out.println("Enter the Value of B");
		int b=  sc.nextInt();
		int sum = a+b;
		int sub = a-b;
		int div = a/b;
		int mul = a*b;
   
      System.out.println("Enter the number ");
      int num1 = sc.nextInt();
      
      if(num1 == 1) {  // Logic
    	  System.out.println(" addition of a and b "+ sum);
      }
      else if(num1==2){ // Logic
    	  System.out.println("Substraction of a and b = "+ sub);
      }
      else if(num1==3) { // Logic
    	  System.out.println("Multiplication of a and b = "+ mul);
    	  
      }
      else if(num1==4) { // Logic
    	  System.out.println("Division of a and b = "+ div);
      }
      else {
    	  System.out.println("Entered number is not in range of 4 ");
      }
      }

}

