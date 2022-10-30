//Java Inheritance
/*
However, if the same method is present in both the superclass and subclass, what will happen?
In this case, the method in the subclass overrides the method in the superclass.
This concept is known as method overriding in Java.*/

//Example 2: Method overriding in Java Inheritance
class laptop{
	public void item2() {  //method in superclass
		System.out.println("The item name is:");
	}
}
//product inherits laptop

class product extends laptop{
	@Override           //overriding the item() method of superclass
	public void item2() {  //method in subclass
		System.out.println("The item name is: DELL");
	}
	//new method in subclass
	public void ram() {
		System.out.println("The RAM of above item is: 8GB");
	}
}
public class B_inheritance2 {
	public static void main(String[] args) {
		product obj=new product(); //object of subclass
		obj.item2(); //calling the item2(); method
		obj.ram();
		
		//however, creating object of superclass will call methods of superclass
		laptop obj1=new laptop();
		obj1.item2();//calls item2(); method of superclass
		
		/*In the above example, the item2() method is present in both the superclass brand and the subclass type.

		Here, we have created an object obj of product

		Now when we call brand() using the object obj, the method inside type is called. 
		This is because the method inside the derived class overrides the method inside the base class.

		This is called method overriding. 
		Note: We have used the @Override annotation to tell the compiler that we are overriding a method. 
		However, the annotation is not mandatory */
	}
}
