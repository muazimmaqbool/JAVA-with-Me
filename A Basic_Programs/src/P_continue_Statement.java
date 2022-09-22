import java.util.Scanner;

// Java continue Statement
public class P_continue_Statement {
	public static void main(String[] args) {
		/*While working with loops, sometimes you might want to skip some statements or terminate the loop.
		 *  In such cases, break and continue statements are used.*/
		//Java continue
		//The continue statement skips the current iteration of a loop (for, while, do...while, etc).
		for(int i=0;i<=10;i++) {
			if(i>4 && i<8) { //if value of i is between 4 and 8  // continue is executed
				continue;  
			}
			System.out.println(i);
		}
		//Here, the continue statement is executed when the value of i becomes more than 4 and less than 8.
		//It then skips the print statement for those values. Hence, the output skips the values 5, 6, and 7.
		
		//Compute the sum of 5 positive numbers
		double number,sum=0;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<6;i++) {
			System.out.println("enter number "+i+" : ");
		   number=input.nextDouble();
			// if number is negative
		      // continue statement is executed
			if(number<0.0) {  // -ve numbers are not added/executed
				continue;  
			}
			sum+=number;
		}
		System.out.println("The sum ="+sum);
		
		//Java continue with Nested Loop
		//continue with Nested Loop
		int i=1,j=1;
		//outer loop
		while(i<=3) {
			System.out.println("Outer Loop = "+i);
			//inner loop
			while(j<=3) {
				if(j==2) { //Here, when the value of j is 2, the value of j is increased and 
			     	j++;                        //the continue statement is executed.
					continue;
					//This skips the iteration of the inner loop. Hence, 
					//the text Inner Loop: 2 is skipped from the output.
					}
				System.out.println("Inner Loop = "+j);
				j++;
			}
			i++;
		}
		
	}

}
