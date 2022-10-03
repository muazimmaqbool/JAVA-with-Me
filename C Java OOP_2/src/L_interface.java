//default methods in Java Interfaces
/*With the release of Java 8, we can now add methods with implementation inside an interface. 
These methods are called default methods.
To declare default methods inside interfaces, we use the default keyword.*/
/*If a large number of classes were implementing this interface, 
 * we need to track all these classes and make changes to them. This is not only tedious but error-prone as well.
To resolve this, Java introduced default methods. Default methods are inherited like ordinary methods.*/

//Example: Default Method in Java Interface
interface polygon66{
	void getarea(int i, int j);
	public default void getsides() {
		System.out.println("i can get the sides here!");
	}
}
class rectangle55 implements polygon66{
	public void getarea(int i, int j) {
		int area=i*j;
	    System.out.println("The area of rectangle is: "+area);
	}
	// overrides the getSides()
	  public void getsides() {
	    System.out.println("I have 4 sides.");
	  }
}
class square implements polygon66{
	public void getarea(int m,int n) {
		System.out.println("The area of square is: "+m*n);
	}
}
public class L_interface {

	public static void main(String[] args) {
		rectangle55 obj=new rectangle55();
		obj.getarea(8,9);
		obj.getsides();
		
		square obj1=new square();
		obj1.getarea(5, 5);
		obj1.getsides();

	}

}
