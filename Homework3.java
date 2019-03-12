package HelloWold;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the first number - ");
		int x = input.nextInt();
		System.out.print("Please, enter the second number - ");
		int y = input.nextInt();
		System.out.print("Please, enter the third number - ");
		int z = input.nextInt();

		System.out.println("the sum of this three numbers is " + (x + y + z));
		System.out.println("the product of this three numbers is " + (x * y * z));
		System.out.println("the average of this three numbers is " + ((x + y + z) / 3));

		if (x > y && x > z)
			System.out.println(x + " is the largest of numberes");
		else if (y > x && y > z)
			System.out.println(y + " is the largest of numbers");
		else
			System.out.println(z + " is the largest of the numbers");

		if (x < y && x < z)
			System.out.print(x + " is the smallest of numberes");
		else if (y < x && y < z)
			System.out.print(y + " is the smallest of numbers");
		else
			System.out.print(z + " is the smallest of the numbers");
	}

}

//(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
//user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//representation of the average. So, if the sum of the values is 7, the average should be 2, not
//2.3333….]
