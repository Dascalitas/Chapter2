package HelloWold;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the first number - ");
		double x = input.nextInt();
		System.out.print("Please, enter the second number - ");
		double y = input.nextInt();

		if (x == y)
			System.out.print("This numbers are equal");
		else if (x > y)
			System.out.print(x + " is larger");
		else
			System.out.print(y + " is larger");
	}
}


//(Comparing Integers) Write an application that asks the user to enter two integers, obtains
//them from the user and displays the larger number followed by the words "is larger". 
//If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.