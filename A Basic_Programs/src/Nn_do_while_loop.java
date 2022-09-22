import java.util.Scanner;
// Java do...while loop
public class Nn_do_while_loop {
	public static void main(String[] args) {
		/*The do...while loop is similar to while loop. However, the body of do...while loop is executed once before the test expression is checked. For example,

		do {
		    // body of loop
		} while(textExpression);
		*/
		//The body of the loop is executed at first. Then the textExpression is evaluated.
		//If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
		
		//Display Numbers from 1 to 5
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		// even if the condition is false even at start of the program the statement inside do will still execute first time
		
		// like this here the statement is going to execute first time even of the condition is false from the beginning
		int a=5;
		do {
			System.out.println(a); // still going to execute first time before it checks condition
			a++;
		}while(a<2);
		
		//Sum of Positive Numbers
		int sum=0,number=0;
		Scanner num=new Scanner(System.in);
		System.out.println("\nEnter Any +ve Number ");
		number=num.nextInt();
		do {
			sum+=number;
			System.out.println("Enter Any +ve Number(to exit enter -ve number)");
			number=num.nextInt();
		}while(number>=0);
		System.out.println("The sum of +ve numbers entered is :"+sum);
		
		//Infinite while loop
		//If the condition of a loop is always true, the loop runs for infinite times (until the memory is full). For example,

		// infinite while loop
		/*while(true){
		    // body of loop
		}*/
		//Here is an example of an infinite do...while loop.

		// infinite do...while loop
		int count = 1;
		do {
		   System.out.println(count); // going to print 1 continuously
		} while(count == 1);
		//In the above programs, the textExpression is always true. 
		//Hence, the loop body will run for infinite times.
		
		//For and while loops
		//The for loop is used when the number of iterations is known. For example,

		/*for (let i = 1; i <=5; ++i) {
		   // body of loop
		}*/
		//And while and do...while loops are generally used when the number of iterations is unknown. For example,

		/*while (condition) {
		    // body of loop
		}*/
	}
}
