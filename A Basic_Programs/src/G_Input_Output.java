import java.util.Scanner;

//Java Basic Input and Output
public class G_Input_Output {
	public static void main(String[] args) {
		// to output something on the screen you can use:
		/* System.out.println(); or
		   System.out.print(); or
		   System.out.printf();*/
		// System is a class
		// out is a public static field: it accepts output data.
		// the keyword static means that the particular member belongs to a type itself, rather than to an instance of that type.
		System.out.printf("Printing using prnitf \n");//here we use newline character because printf didn't move to nextline	
		System.out.println("Printing using prnit");// here we didn't use new line character because println moves to next line 	
		System.out.print("Printing using prnitln");// didn't move automatically to next line
		/* print() - It prints string inside the quotes.
		   println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
           printf() - It provides string formatting (similar to printf in C/C++ programming).*/
           
         // INPUT
		// In order to use the object of Scanner, we need to import java.util.Scanner; package.
		// Then, we need to create an object of the Scanner class. We can use the object to take input from the user.
		Scanner input=new Scanner(System.in); // creating object of scanner i.e input
		System.out.println("\nEnter any number");
		int number=input.nextInt();// taking input from the user and storing into number variable of type int
		//call the nextInt() method of the Scanner class to get an integer input from the user.
		//Similarly, we can use nextLong(), nextFloat(), nextDouble(), and next() methods to get long, float, double, and string input respectively from the user.
		System.out.println("You entered :"+number);
		
		//closing the scanner object (not necessary closing it)
		
		//float, double and String Input
		Scanner input1=new Scanner(System.in);
		System.out.println("Enter float value :");
		float f1=input1.nextFloat();
		System.out.println("Float value entered is :"+f1);
		System.out.println("Enter Double value :");
		double d1=input1.nextDouble();
		System.out.println("Double value entered is :"+d1);
		System.out.println("Enter String value :");
		String str=input1.next();
		System.out.println("String value entered is :"+str);
		
		input.close();
		input1.close();
		
 
	}
}
