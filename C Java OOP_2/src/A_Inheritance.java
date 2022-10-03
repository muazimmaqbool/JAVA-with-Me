//Java Inheritance
/*Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.
The new class that is created is known as subclass (child or derived class) and
the existing class from which the child class is derived is known as superclass (parent or base class).
The extends keyword is used to perform inheritance in Java. */
class brand{ //super class/parent class/base class
	String name;
	public void available() {
		System.out.println("Yes! Available "+name);
	}
}
//inherit from brand
class type extends brand{   //sub class/child class
	public void display() {
		System.out.println("Wanna buy: "+name+" ?");
	}
}
public class A_Inheritance {

	public static void main(String[] args) {
		type obj=new type();
		obj.name="HP"; //accessing the fields of superclass using the object of subclass
		obj.available(); //calling the method of superclass using the object of subclass
		obj.display(); //calling the method of subclass
		
		brand obj1=new brand(); //object of superclass
		obj1.name="Dell";
		obj1.available();
		//obj1.display(); //trying to access method of subclass by the object of superclass, it will show error
	}
	//is-a relationship
	/*In Java, inheritance is an is-a relationship. That is,
	we use inheritance only if there exists an is-a relationship between two classes. For example,
	Car is a Vehicle
	Orange is a Fruit
	Surgeon is a Doctor
	Dog is an Animal
	Here, Car can inherit from Vehicle, Orange can inherit from Fruit, and so on.*/
	
	//Why use inheritance?
	/*The most important use of inheritance in Java is code reusability. 
	The code that is present in the parent class can be directly used by the child class.
	Method overriding is also known as runtime polymorphism. 
	Hence, we can achieve Polymorphism in Java with the help of inheritance.*/
	
}
