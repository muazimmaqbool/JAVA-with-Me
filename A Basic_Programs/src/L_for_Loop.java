//Java for Loop
public class L_for_Loop {
	public static void main(String[] args) {
		/*In computer programming, loops are used to repeat a block of code. For example, 
		 * if you want to show a message 100 times, 
		 * then rather than typing the same code 100 times, you can use a loop.*/
	/*Java for loop is used to run a block of code for a certain number of times. The syntax of for loop is:
		for (initialExpression; testExpression; updateExpression) {
		    // body of the loop
		      }*/
		int n=5;
		for(int i=1;i<=n;i++) {
			System.out.println("For Loop Example "+i);
		}
		//print numbers from 0 to 10
		for(int i=0;i<=10;i++) {
			System.out.print(i+" ");
		}
		//find the sum of natural numbers from 1 to 1000.
		int sum=0;
		int num=1000;
		for(int i=1;i<=num;++i) { 
			sum+=i; //sum=sum+i
		}
		System.out.println("\nThe Sum of natural Numbers from 1 to 1000 is :-> "+sum);

	// The above program to find the sum of natural numbers from 1 to 1000 can also be written as
	int sum1=0;
	int num1=1000;
	for(int i=num1;i>=1;--i) {
		sum1+=i;
	}
	System.out.println("The Sum of natural Numbers from 1 to 1000 is :-> "+sum1);
	}
}
