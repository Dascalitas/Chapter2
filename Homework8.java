package HelloWold;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the number - ");
		int x = input.nextInt();

		int a = x / 10000;
		int b = (x / 1000) % 10;
		int c = (x / 100) % 10;
		int d = (x % 100) / 10;
		int e = x % 10;

		System.out.print(a + "   " + b + "   " + c + "   " + d + "   " + e);
	}

}


//(Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, 
//separates the number into its individual digits and prints the digits
//separated from one another by three spaces each. For example, if the user types in the number 42339,
//the program should print "4	  2	  3	  3	  9"
//Assume that the user enters the correct number of digits. What happens when you enter a
//number with more than five digits? What happens when you enter a number with fewer than five
//digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
//need to use both division and remainder operations to “pick off” each digit.]