/*
Filename:	HighestNum.java
Author:	Jenna
Date:	2/19/19

User inputs three values, program determines which value is the highest between three values.
*/

import java.util.Scanner;

public class HighestNum
{

	public static void main(String[] args)
	{
		int a, b, c;

		System.out.println("Enter three numbers: ");
		Scanner kbd = new Scanner(System.in);

		a = kbd.nextInt(); // User Input

		b = kbd.nextInt(); 

		c = kbd.nextInt(); 

		if ( a > b && a > c )  // Check for Largest number
			{
				System.out.println("First number is largest.");
			}
		else if ( b > a && b > c )
			{
				System.out.println("Second number is largest.");
			}

		else if ( c > a && c > b )
			{
				System.out.println("Third number is largest.");
			}
		else
			{
				System.out.println("Numbers are not valid.");
			}
	}

}