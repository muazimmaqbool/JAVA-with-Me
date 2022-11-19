//Java Singleton Class
//In Java, Singleton is a design pattern that ensures that a class can only have one object.
/*
To create a singleton class, a class must implement the following properties:
Create a private constructor of the class to restrict object creation outside of the class.
Create a private attribute of the class type that refers to the single object.
Create a public static method that allows us to create and access the object we created. Inside the method, 
we will create a condition that restricts us from creating more than one object.*/

//Example: Java Singleton Class Syntax
class SingletonExample {

		   // private field that refers to the object
		   private static SingletonExample singleObject;
		                                              
		   private SingletonExample() {
		      // constructor of the SingletonExample class
		   }

		   public static SingletonExample getInstance() {
		      // write code that allows us to create only one object
		      // access the object as per our need
		   }
}
		   /*In the above example,

		   private static SingletonExample singleObject - a reference to the object of the class.
		   private SingletonExample() - a private constructor that restricts creating objects outside of the class.
		   public static SingletonExample getInstance() - this method returns the reference to
		    the only object of the class. Since the method static, it can be accessed using the class name.*/
public class I_SingletonClass {

	public void main(String[] args) {
		//see example in next program
		}

}
