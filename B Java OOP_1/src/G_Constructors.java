//Java Constructors
public class G_Constructors {
//A constructor in Java is similar to a method that is invoked when an object of the class is created.
//Unlike Java methods, a constructor has the same name as that 
//of the class and does not have any return type. For example,
/*class Test {
  Test() {
    // constructor body
  } //Here, Test() is a constructor. It has the same name as that of the class and doesn't have a return type
}*/ 
	//Example 1: Java Constructor
	// constructor
	private String name;
	G_Constructors(){
		System.out.println("Constructor is called ");
		name="Muazim Maqbool Rather";
	}	
	public static void main(String[] args) {
		// constructor is invoked while
	    // creating an object of the G_Constructors class
		G_Constructors obj=new G_Constructors();
		System.out.println("My name is: "+obj.name);
	}
	/*A class can have multiple constructors, as long as their signature (the parameters they take) 
	 * are not the same. You can define as many constructors as you need. ... 
	This is what constructor overloading means, that a Java class contains multiple constructors.*/
}
//Important Notes on Java Constructors
/*Constructors are invoked implicitly when you instantiate objects.
The two rules for creating a constructor are:
The name of the constructor should be the same as the class.
A Java constructor must not have a return type.
If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time. The default constructor initializes instance variables with default values. For example, the int variable will be initialized to 0
Constructor types:
No-Arg Constructor - a constructor that does not accept any arguments
Parameterized constructor - a constructor that accepts arguments
Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.
A constructor cannot be abstract or static or final.
A constructor can be overloaded but can not be overridden.*/
