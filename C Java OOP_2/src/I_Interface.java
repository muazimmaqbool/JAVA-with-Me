//Java Interface
/*An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
We use the interface keyword to create an interface in Java. For example,
interface Language {
  public void getType();
    public void getVersion();      Here, Language is an interface.
								It includes abstract methods: getType() and getVersion(). 
}*/
//Example 1: Java Interface
interface polygon{
	void getArea(int length,int breadth); //this method is abstract as its inside interface class
}
//implement the Polygon interface
class rectangle implements polygon{
	// implementation of abstract method\
	public void getArea(int length,int breadth) {
		System.out.println("The Area of Reactangle is: "+(length*breadth));
	}
}
public class I_Interface {

	public static void main(String[] args) {
		rectangle r1=new rectangle();
		r1.getArea(5,6);
		/*we have created an interface named Polygon. The interface contains an abstract method getArea().
		Here, the Rectangle class implements Polygon. And, provides the implementation of the getArea() method.*/
	}
//Advantages of Interface in Java
	/*Now that we know what interfaces are, let's learn about why interfaces are used in Java.

	Similar to abstract classes, interfaces help us to achieve abstraction in Java.

	Here, we know getArea() calculates the area of polygons but the way area is calculated is different for different polygons. Hence, the implementation of getArea() is independent of one another.
	Interfaces provide specifications that a class (which implements it) must follow.

	In our previous example, we have used getArea() as a specification inside the interface Polygon. This is like setting a rule that we should be able to get the area of every polygon.

	Now any class that implements the Polygon interface must provide an implementation for the getArea() method.
	Interfaces are also used to achieve multiple inheritance in Java. For example,
	 
	interface Line {
	…
	}

	interface Polygon {
	…
	}

	class Rectangle implements Line, Polygon {
	…
	}


	Here, the class Rectangle is implementing two different interfaces. This is how we achieve multiple inheritance in Java.
	Note: All the methods inside an interface are implicitly public and all fields are implicitly public static final. For example,

	interface Language {
	  
	  // by default public static final
	  String type = "programming language";

	  // by default public
	  void getName();
	  }*/
}
