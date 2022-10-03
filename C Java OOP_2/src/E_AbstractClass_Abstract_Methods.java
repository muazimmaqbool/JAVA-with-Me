//Java Abstract Class and Abstract Methods

//Java Abstract Class
//The abstract class in Java cannot be instantiated 
//(we cannot create objects of abstract classes). We use the abstract keyword to declare an abstract class.

//Java Abstract Method
//A method that doesn't have its body is known as an abstract method.
//We use the same abstract keyword to create abstract methods.

//An abstract class can have both the regular methods and abstract methods
//If a class contains an abstract method, 
//then the class should be declared abstract. Otherwise, it will generate an error.

//Example: Java Abstract Class and Method
//(Though abstract classes cannot be instantiated, we can create subclasses from it.
//We can then access members of the abstract class using the object of the subclass. )
abstract class lang{ // can't creates its objects, 
	public void display() {
		System.out.println("Here we speek Kashmiri language");
	}
}
public class E_AbstractClass_Abstract_Methods extends lang {
	// can create objects of "E_AbstractClass_Abstract_Methods" which inherits superclass lang
	public static void main(String[] args) {
		E_AbstractClass_Abstract_Methods obj=new E_AbstractClass_Abstract_Methods();
		obj.display(); //accessing methods of abstract class using object of its subclass
        //lang obj1=new lang(); //trying to create object of abstract class it will show error
	}
	/*Key Points to Remember
	We use the abstract keyword to create abstract classes and methods.
	An abstract method doesn't have any implementation (method body).
	A class containing abstract methods should also be abstract.
	We cannot create objects of an abstract class.
	To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
	A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
	We can access the static attributes and methods of an abstract class using the reference of the abstract class. 
	For example,
	Animal.staticMethod();*/

}
