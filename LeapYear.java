/*
 Program to find that the given year is a Leap year or not
  Author :- Ayush_Singh
  Date:- 06/10/2022
  */

package core_java;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter an Year::");
		//Creating Scanner object to take the value fron the user
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		//Applying condition to check that the entered year is leap year or not
		if (((year % 4 == 0) && (year % 100!=0)) || (year % 400 == 0))
			System.out.println("Specified year is a leap yeear");
		else
			System.out.println("Specified year is not a leap yera");
			}
	}
