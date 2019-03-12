package HelloWold;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pos = 0;
		int neg = 0;
		int zero = 0;

		System.out.println("Please, enter your first number - ");
		int x = input.nextInt();
		if (x > 0)
			pos++;
		else if (x < 0)
			neg++;
		else
			zero++;

		System.out.println("Please, enter your second number - ");
		x = input.nextInt();
		if (x > 0)
			pos++;
		else if (x < 0)
			neg++;
		else
			zero++;

		System.out.println("Please, enter your third number - ");
		x = input.nextInt();
		if (x > 0)
			pos++;
		else if (x < 0)
			neg++;
		else
			zero++;

		System.out.println("Please, enter your fourth number - ");
		x = input.nextInt();
		if (x > 0)
			pos++;
		else if (x < 0)
			neg++;
		else
			zero++;

		System.out.println("Please, enter your fifth number - ");
		x = input.nextInt();
		if (x > 0)
			pos++;
		else if (x < 0)
			neg++;
		else
			zero++;

		System.out.println("positive numbers - " + pos);
		System.out.println("negative numbers - " + neg);
		System.out.println("zero numbers - " + zero);
	}

}

//(Negative, Positive and Zero Values) Write a program that inputs five numbers
//and determines and prints the number of negative numbers input, the number of positive numbers input and
//the number of zeros input.
