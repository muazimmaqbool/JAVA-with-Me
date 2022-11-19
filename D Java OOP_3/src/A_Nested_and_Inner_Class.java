//Java Nested and Inner Class
/*In Java, you can define a class within another class. Such class is known as nested class. For example,
class OuterClass {
    // ...
    class NestedClass {
        // ...
    }
}*/
//There are two types of nested classes you can create in Java.
//Non-static nested class (inner class)
//Static nested class

//Non-Static Nested Class (Inner Class)
/*non-static nested class is a class within another class. 
It has access to members of the enclosing class (outer class). It is commonly known as inner class.
Since the inner class exists within the outer class, you must instantiate the outer class first, 
in order to instantiate the inner class.*/
//Example 1: Inner class
class laptop{
	double price;
	//nested class
	class Ram{
		//members of nested class
		double GB;
		String typeram;
	    double getram() {
	    	return 8;
	    }
	    public String gettype( ) {
	    	return "DDR4";
	    }
	    
	}
	// nested protected class
	protected class storage{
		// members of protected nested class
		double memory;
		String type;
		double getmemory() {
			return 512;
		}
		public String gettype() {
			return "SSD";
		}
	}
}
public class A_Nested_and_Inner_Class {

	public static void main(String[] args) {
		// create object of Outer class laptop
		laptop obj=new laptop();
		
		//Using the instance of the outer class, we then created objects of inner classes:
		//syntax : Outerclass.InnerClass objectofInnerClass=new object_of_outerclass.new InnerClass();

		// create an object of inner class Ram using outer class
		laptop.Ram obj1=new laptop().new Ram(); // or laptop.Ram =obj.new Ram();
		
		// create an object of inner class storage using outer class laptop
		//laptop.storage obj2=new laptop().new storage(); 
		// or
		laptop.storage obj2=obj.new storage(); //
		
		System.out.println("Ram : "+obj1.getram());
		System.out.println("type : "+obj1.gettype());
		
		System.out.println("\nMemory: "+obj2.getmemory());
		System.out.println("type : "+obj2.gettype());
		}

}
