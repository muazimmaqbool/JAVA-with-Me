import java.util.Scanner;
// Java while Loop
public class N_while_Loop {
	public static void main(String[] args) {
		/*loops are used to repeat a block of code. For example, if you want to show a message 100 times, 
		 * then you can use a loop. It's just a simple example; you can achieve much more with loops.
		 */
		//java while loop
		//Java while loop is used to run a specific code until a certain condition is met/true. 
		//The syntax of the while loop is:
		/* while (testExpression) {
			    // body of loop
			}*/
		int n=1,m=10;
		// while loop from 1 to 10
		while(n<=m) {
			System.out.print(n);
			n++;
		}
		//Java program to find the sum of positive numbers
		Scanner num=new Scanner(System.in);
		System.out.println("\nEnter Any +ve Number ");
		int number=num.nextInt(); //nextInt() takes integer input from the user.
		int sum=0;
		while(number>=0) {
			if(number==007) {
				break; // to exit while loop press 007 or any -ve number
			}
			sum+=number;
			System.out.println("Enter Any +ve Number(to exit enter -ve number or 007)");
			number=num.nextInt();
		}
		System.out.println("The sum of Numbers Your Entered is :"+sum);
		num.close();
	}
}
