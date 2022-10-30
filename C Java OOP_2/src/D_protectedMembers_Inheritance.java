//protected Members in Inheritance
/*In Java, if a class includes protected fields and methods, 
then these fields and methods are accessible from the subclass of the class.*/
class student{
	protected String name;
	protected void display() {
		System.out.println("I am an student,");
	}	
}
class s1 extends student{
	public void getinfo() {
		System.out.println("and my name is: "+name);
	}
}
public class D_protectedMembers_Inheritance {

	public static void main(String[] args) {
		s1 obj=new s1();
		obj.name="Muazim Maqbool Rather";
		obj.display();
		obj.getinfo();
		/*Here, we are able to access the protected field and method of the superclass
		using the labrador object of the subclass.*/
	
		//Types of inheritance (There are five types of inheritance.)
		/*1. Single Inheritance
		In single inheritance, a single subclass extends from a single superclass.
		
		2. Multilevel Inheritance
		In multilevel inheritance, a subclass extends from a superclass and 
		then the same subclass acts as a superclass for another class.
		
		3. Hierarchical Inheritance
		In hierarchical inheritance, multiple subclasses extend from a single superclass. 
		
		4. Multiple Inheritance
		In multiple inheritance, a single subclass extends from multiple superclasses
		
		5. Hybrid Inheritance
		Hybrid inheritance is a combination of two or more types of inheritance.
		Here, we have combined hierarchical and multiple inheritance to form a hybrid inheritance.*/
		
	//Note: Java doesn't support multiple inheritance. However, we can achieve multiple inheritance using interfaces.
		

	}

}
