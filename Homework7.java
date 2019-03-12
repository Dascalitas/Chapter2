package HelloWold;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the number - ");
		int x = input.nextInt();

		double r = (double) x;

		System.out.println("diameter of circle is - " + (2 * r));
		System.out.println("circumference of the circle is - " + (2 * Math.PI * r));
		System.out.print("area of the circle is - " + (Math.PI * (r * r)));
	}

}
