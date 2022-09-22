//Java  instanceof in Interface
//The instanceof operator is also used to check whether an object of a 
//class is also an instance of the interface implemented by the class.
interface laptop{
	
}
class pc implements laptop{
	
}
/*
 * Differences between a Class and an Interface:
A class can be instantiated i.e, objects of a class can be created. 
An Interface cannot be instantiated i.e, objects cannot be created. Classes does not support multiple inheritance. 
Interface supports multiple inheritance.*/
public class Y_instanceof_Interface {

	public static void main(String[] args) {
		// create an object of the pc class
		pc obj1=new pc();
		// checks if the object of pc
	    // is also an instance of laptop
	    System.out.println(obj1 instanceof laptop);  // prints true
	    System.out.println(obj1 instanceof pc);  // prints true
	}

}
