import java.util.Scanner;

//Java Recursion
//In Java, a method that calls itself is known as a recursive method. And, this process is known as recursion.
// see How Recursion works? on programiz
public class V_Recursion {
	//Example: Factorial of a Number Using Recursion
	static int factorial(int n) {
		if(n!=0) {
			return n*factorial(n-1); // recursive call
		}
		else
			return 1;
	}
  // Working of Factorial Program on programiz
	public static void main(String[] args) {
		System.out.println("Enter Your Numbre");
		Scanner num=new Scanner(System.in);
		int number=num.nextInt();
		int result=factorial(number);
		System.out.println("The factorial of "+number+" is: "+result);
	}
}
//Advantages and Disadvantages of Recursion
/*When a recursive call is made, new storage locations for variables are allocated on the stack.
As, each recursive call returns, the old variables and parameters are removed from the stack.
Hence, recursion generally uses more memory and is generally slow.
On the other hand, a recursive solution is much simpler and takes less time to write, debug and maintain.*/
