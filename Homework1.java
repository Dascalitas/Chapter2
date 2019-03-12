package HelloWold;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the first number - ");
		double x = input.nextInt();
		System.out.print("Please, enter the second number - ");
		double y = input.nextInt();

		System.out.println("the sum of the numbers is " + (x + y));
		System.out.println("the difference of the numbers is " + (x - y));
		System.out.println("the product of the numbers is " + (x * y));
		System.out.print("the division of the numbers is " + (x / y));

	}

}

//(Arithmetic) Write an application that asks the user to enter two integers, obtains them
//from the user and prints their sum, product, difference and quotient (division). Use the techniques
//shown in Fig. 2.7.
