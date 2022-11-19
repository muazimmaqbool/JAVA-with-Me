//Example 2: Anonymous Class Implementing an Interface
interface vechile{
	public void display();
}
class Anonymousdemo1{
	public void createclass() {
		 // anonymous class implementing interface
		vechile car1=new vechile() {
			public void display() {
				System.out.println("Inside an Anonymous class \"Anonymousdemo1\" ");
			}	
		};
		car1.display();
	}
}
public class H_Anonymous_Class {

	public static void main(String[] args) {
		Anonymousdemo1 anon=new Anonymousdemo1();
		anon.createclass();
//In the above example, we have created an anonymous class that implements the vechile interface.
	}
//Advantages of Anonymous Classes
	/*In anonymous classes, objects are created whenever they are required. 
	That is, objects are created to perform some specific tasks. For example,

	Object = new Example() {
	   public void display() {
	      System.out.println("Anonymous class overrides the method display().");
	   }
	};
	Here, an object of the anonymous class is created dynamically when we need to override the display() method.

	Anonymous classes also help us to make our code concise.*/
}
