import java.util.Scanner;
//Java if...else Statement
//we use the if..else statement to run a block of code among more than one alternatives.
public class J_if_else {
	public static void main(String[] args) {
		int n=5;
		//if
		if(n>10) {
			System.out.println("Your Number is Greater Than 10");
		}
		System.out.println("Statement outside If"); // this will also execute even if the if statement is true
		
		//if-else
		Scanner b=new Scanner(System.in);
		System.out.println("Enter your Number :");
		int x=b.nextInt();
		if(x%2==0) {
			System.out.println("Your Number is Even");
		}
		else {
			System.out.println("Your Number is Odd");
		}
		
		//if...else...if Statement
		Scanner z=new Scanner(System.in);
		System.out.println("Enter First Digit of your Enrollment Number (6-2)");
		int enroll=z.nextInt();
		if(enroll==6) {
			System.out.println("You Belong To CSE Department");
		}
		else if(enroll==5) {
			System.out.println("You Belong To CIVIL Department");
		}
		else if(enroll==4) {
			System.out.println("You Belong To E&C Department");
		}
		else if(enroll==3) {
			System.out.println("You Belong To ELECTRICIAL Department");
		}
		else
			System.out.println("You Belong To MECHANICAL Department");
		
		
		//Nested if..else Statement
		//In Java, it is also possible to use if..else statements inside an if...else statement. It's called the nested if...else statement.
		Scanner Age=new Scanner(System.in);
		System.out.println("Enter your Age:");
		System.out.println("Press 1 to exit");
		int age=Age.nextInt();
		if(age>=18) {
			if(age<=25) {
				System.out.println("Go Left !");
			}
			else
				System.out.println("Go Right !");
		}
		else if(age<18) {
			if(age>=10) {
				System.out.println("Go Up !");
			}
			else
				System.out.println("Go Down !");
		}
		else
			System.out.println("Please Enter Correct Value!");
	}
}
