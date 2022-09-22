//Java instanceof during Inheritance
//We can use the instanceof operator to check if objects of the subclass is also an instance of the superclass

//super class
class test1{
	
}
//sub class
class test2 extends test1{
	
}
public class X_instanceof_Inheritance {
	public static void main(String[] args) {
		// create an object of the subclass
		test2 obj=new test2();
		boolean result=obj instanceof test2; // checks if obj is an instance of the subclass
		System.out.println("is obj instance of test2 subclass: "+result); //prints true
		// checks if obj is an instance of the superclass
		System.out.print("is obj instance of test1 superclass: "); 
	    System.out.print(obj instanceof test1); // prints true
	    
	    //create object of the superclass
	    test1 obj1=new test1();
	   //checks if obj1 is an instance of the superclass
	    System.out.print("\nis obj1 instance of test1 superclass: "); 
	    System.out.print(obj1 instanceof test1); // prints true
	    
	    // checks if obj is an instance of the subclass
	    System.out.print("\nis obj1 instance of test2 subclass: "); 
	    System.out.print(obj1 instanceof test2); // prints false as obj1 is instance of test1 superclass
	    //instance of subclass is also intance of superclass
	}

}
