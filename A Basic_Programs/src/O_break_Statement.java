import java.util.Scanner;
// Java break Statement
public class O_break_Statement {
	public static void main(String[] args) {
		/*While working with loops, it is sometimes desirable to 
		skip some statements inside the loop or terminate the loop immediately
		without checking the test expression.

		In such cases, break and continue statements are used. 
		You will learn about the Java continue statement in the next tutorial.
		
		 The break statement in Java terminates the loop immediately,
		 and the control of the program moves to the next statement following the loop.
		 It is almost always used with decision-making statements (Java if...else Statement).
		 Here is the syntax of the break statement in Java:
		*/
		
		//if the value of i is 5 the loop terminates
		for(int i=0;i<=10;i++) {
			if(i==5) {
				break; // when i==5 loop ends
			}
			System.out.println(i);
		}
	//program below calculates the sum of numbers entered by the user until user enters a negative number.
		Scanner value=new Scanner(System.in);
		double sum=0;
		while(true) {
			System.out.println("Enter any +ve Number :");
			//takes double input from user
			Double number=value.nextDouble();
			// if number is negative the loop terminates
			if(number<0.0) {
				System.out.println("Loop terminates as user enters -ve number");
				break;
			}
			sum+=number;	
		}
		System.out.println("The Sum of the +ve numbers you entered is :"+sum);
	}
}
