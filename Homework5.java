package HelloWold;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the number - ");
		int x = input.nextInt();

		if (x % 2 == 0)
			System.out.print("the number is even");
		else
			System.out.print("the number is odd");
	}

}
