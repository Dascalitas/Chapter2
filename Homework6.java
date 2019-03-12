package HelloWold;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the number - ");
		int x = input.nextInt();
		System.out.print("Please, enter the number - ");
		int y = input.nextInt();

		if (x % y == 0)
			System.out.print("the " + x + "is a multiple of " + y);
		else
			System.out.print("the " + x + " is not a multiple of " + y);
	}

}
