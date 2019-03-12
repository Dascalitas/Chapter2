package HelloWold;

public class Homework9 {

	public static void main(String[] args) {
		System.out.println("number\tsquare\tcube");
		
		for (int n=0; n<=10; n++)
			System.out.println(n+"\t"+Math.sqrt(n)+"\t"+Math.cbrt(n));	
	}

}

//(Table of Squares and Cubes) Using only the programming techniques you learned in this
//chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
//prints the resulting values in table format, as shown below. 