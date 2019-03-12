package HelloWold;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the first number - ");
		int a = input.nextInt();
		System.out.print("Please, enter the second number - ");
		int b = input.nextInt();
		System.out.print("Please, enter the third number - ");
		int c = input.nextInt();
		System.out.print("Please, enter the fourth number - ");
		int d = input.nextInt();
		System.out.print("Please, enter the fifth number - ");
		int e = input.nextInt();

		if (a > b && a > c && a > d && a > e)
			System.out.println(a + " is the largest of numberes");
		else if (b > a && b > c && b > d && b > e)
			System.out.println(b + " is the largest of numbers");
		else if (c > a && c > b && c > d && c > e)
			System.out.println(c + " is the largest of numberes");
		else if (d > a && c > b && c > d && c > e)
			System.out.println(d + " is the largest of numbers");
		else
			System.out.println(e + " is the largest of numbers");

		if (a < b && a < c && a < d && a < e)
			System.out.println(a + " is the smallest of numbers");
		else if (b < a && b < c && b < d && b < e)
			System.out.println(b + " is the smallest of numbers");
		else if (c < a && c < b && c < d && c < e)
			System.out.println(c + " is the smallest of numberes");
		else if (d < a && c < b && c < d && c < e)
			System.out.println(d + " is the smallest of numbers");
		else
			System.out.println(e + " is the largest of numbers");
	}

}

//(Largest and Smallest Integers) Write an application that reads five integers and determines
//and prints the largest and smallest integers in the group. Use only the programming techniques you
//learned in this chapter.
