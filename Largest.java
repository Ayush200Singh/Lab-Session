package corejava;
// Code written by Ayush Singh
// Program to find Largest number
import java.util.Scanner;
public class Largest_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);   // Use Scanner class To take Input from user
		System.out.println("Enter first number");
		int num = sc.nextInt();
		System.out.println("Enter second number");
		int num1 = sc.nextInt();
		if(num<num1) {  // logic to find largest number
			System.out.println(  num1+" is largest number"+ num1);
		}
		else {
			System.out.println(  num+"  is largest number");
		}

	}

}
