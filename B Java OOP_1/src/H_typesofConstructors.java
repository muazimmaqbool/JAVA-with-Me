//Types of Constructor
/*
In Java, constructors can be divided into 3 types:

No-Arg Constructor
Parameterized Constructor
Default Constructor*/
public class H_typesofConstructors {
	//No-Arg Constructors If a constructor does not accept any parameters, it is known as a no-argument constructor
	//Example 2: Java private no-arg constructor
	int i;
	String name;
	private H_typesofConstructors() { // constructor with no parameter
		i=5;
		name="Java";
		System.out.println("No-Arg Constructor is Called ");
	}
	//Parameterized Constructor
	String language;
	H_typesofConstructors(String lang){
		language=lang;
		//writing this code to print "Parameterized Constructor is Called" only once when java is passed
		if(language=="java") {
			System.out.println("Parameterized Constructor is Called ");
			System.out.println("The value of Language: "+language);
			
		}
		System.out.println("The value of Language: "+language);
	}
	//Default Constructor
	/*If we do not create any constructor, the Java compiler automatically create a no-arg constructor
	 during the execution of the program.
	This constructor is called default constructor.*/
	int a;
	boolean b;
	// a private constructor //to use this remove previous private H_typesofConstructors() block
	/*private H_typesofConstructors() {
		a = 22;
	    b = true;   //o/p = a=22 and b=true;
	  }*/
	public static void main(String[] args) {
		// calling the constructor without any parameter
		H_typesofConstructors obj1=new H_typesofConstructors();
		System.out.println("Value of i: "+obj1.i);
		System.out.println("Value of name: "+obj1.name);
		
		// call constructor by passing a single value
		H_typesofConstructors obj2=new H_typesofConstructors("java");
		H_typesofConstructors obj3=new H_typesofConstructors("python");
		H_typesofConstructors obj4=new H_typesofConstructors("c++");
		
		// A default constructor is called
		H_typesofConstructors obj5=new H_typesofConstructors();
		System.out.println("Default Constructor values ");
		System.out.println("a= "+obj5.a);
		System.out.println("b= "+obj5.b);
		
		//default value of boolean is false
	}
}
