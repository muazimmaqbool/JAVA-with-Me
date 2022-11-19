// Java Reflection
//In Java, reflection allows us to inspect 
//and manipulate classes, interfaces, constructors, methods, and fields at run time.

//There is a class in Java named Class that keeps all the information about objects and classes at runtime. 
//The object of Class can be used to perform reflection.

//Reflection of Java Classes
/*
In order to reflect a Java class, we first need to create an object of Class.
And, using the object we can call various methods to get information about methods,
fields, and constructors present in a class.
There exists three ways to create objects of Class:
	
1. Using forName() method
class Dog {...}

// create object of Class
// to reflect the Dog class
Class a = Class.forName("Dog");
Here, the forName() method takes the name of the class to be reflected as its argument.

2. Using getClass() method
// create an object of Dog class
Dog d1 = new Dog();
// create an object of Class
// to reflect Dog
Class b = d1.getClass();
Here, we are using the object of the Dog class to create an object of Class.

3. Using .class extension
// create an object of Class
// to reflect the Dog class
Class c = Dog.class;

Now that we know how we can create objects of the Class. 
We can use this object to get information about the corresponding class at runtime.*/

class food{
	//// used in next program
}
public class R_Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
