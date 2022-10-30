import java.util.Scanner;

//Java Encapsulation
/*Encapsulation is one of the key features of object-oriented programming.
Encapsulation refers to the bundling of fields and methods inside a single class.
It prevents outer classes from accessing and changing fields and methods of a class.
 This also helps to achieve data hiding.*/

//Example 1: Java Encapsulation
class Area{
	// fields to calculate area
	  int length;
	  int breadth;

	  // constructor to initialize values
	  Area(int len,int b){
		  this.length=len;
		  this.breadth=b;  
	  }
	  // method to calculate area
	  public void getarea() {
		  int area=length*breadth;
		  System.out.println("Area: "+area);
	  }
}
public class R_Encapsulation {

	public static void main(String[] args) {
		System.out.println("Enter Length and Breadth to find Area: ");
		Scanner var=new Scanner(System.in);
		int num=var.nextInt();
		int num1=var.nextInt();
		Area obj=new Area(num,num1);
		obj.getarea();
		/*Why Encapsulation?
				In Java, encapsulation helps us to keep related fields and methods together, which makes our code cleaner and easy to read.
				It helps to control the values of our data fields. For example,
				class Person {
				  private int age;

				  public void setAge(int age) {
				    if (age >= 0) {
				      this.age = age;
				    }
				  }
				}

	/*Here, we are making the age variable private and applying logic inside the setAge() method. 
	Now, age cannot be negative.
	The getter and setter methods provide read-only or write-only access to our class fields. For example,
	getName()  // provides read-only access
	setName() // provides write-only access
	It helps to decouple components of a system. For example, we can encapsulate code into multiple bundles.

	These decoupled components (bundle) can be developed, tested, and debugged independently and concurrently. 
	And, any changes in a particular component do not have any effect on other components.
	We can also achieve data hiding using encapsulation. In the above example,
	if we change the length and breadth variable into private, then the access to these fields is restricted.
	And, they are kept hidden from outer classes. This is called data hiding.	*/
	

	}

}
