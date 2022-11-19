//Static Nested Class
/* we can also define a static class inside another class. 
 Such class is known as static nested class. Static nested classes are not called static inner classes.
 Unlike inner class, a static nested class cannot access the member variables of the outer class. 
 It is because the static nested class doesn't require you to create an instance of the outer class.
 OuterClass.NestedClass obj = new OuterClass.NestedClass();*/

//Example 3: Static Inner Class
//Example 4: Accessing members of Outer class inside Static Inner Class
class motherboard{
	String model;
	public motherboard(String mod) {
		this.model=mod;
	}
	//static nested class
	static class USB{
		int usb2=2;
		int usb3=1;
		int getport() {
			// accessing the variable model of the outer classs
			//if(motherboard.this.model.equals("MSI")){//error:non-static variable this cannot 
			//	return 4;                                     //be referenced from a static context
			//}
			// the error is because :
			/*This is because we are not using the object of the outer class to create an object of the inner class. 
			Hence, there is no reference to the outer class Motherboard stored in Motherboard.this.*/
			
			return usb2+usb3;
		}
	}
	
}
public class C_NestedClass_InnerClass {

	public static void main(String[] args) {
		// create an object of the static nested class
	       // using the name of the outer class
		motherboard.USB objusb=new motherboard.USB();
		System.out.println("Total ports: "+objusb.getport());
		
		//Now, let's see what would happen if you try to access the members of the outer class:

	}
	/*Key Points to Remember
	Java treats the inner class as a regular member of a class. 
	They are just like methods and variables declared inside a class.
	
	Since inner classes are members of the outer class, you can apply any access modifiers
	like private, protected to your inner class which is not possible in normal classes.
	
	Since the nested class is a member of its enclosing outer class, 
	you can use the dot (.) notation to access the nested class and its members.
	
	Using the nested class will make your code more readable and provide better encapsulation.
	
	Non-static nested classes (inner classes) have access to other members of the outer/enclosing class, 
	even if they are declared private.*/
}
