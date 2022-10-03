//Implementing Multiple Interfaces (In Java, a class can also implement multiple interfaces)
interface vechile{
	 void gettyres(int n);
}
interface bike{
	 public void gettyres1(int n);
}
class item2 implements vechile,bike{
	@Override
	public void gettyres(int n) {
		System.out.println("The Number of tyres in car are: "+n);
	}
	public void gettyres1(int n) {
		System.out.println("The Number of tyres in bike are: "+n);
	}
	
}
//Extending an Interface
/*Similar to classes, interfaces can extend other interfaces. 
The extends keyword is used for extending interfaces. For example,

interface Line {
  // members of Line interface
}

// extending interface
interface Polygon extends Line {
  // members of Polygon interface
  // members of Line interface
}
the Polygon interface extends the Line interface.
 Now, if any class implements Polygon, it should provide implementations for all the abstract 
 methods of both Line and Polygon.
*/

//Extending Multiple Interfaces
/*An interface can extend multiple interfaces. For example,

interface A {
   ...
}
interface B {
   ... 
}

interface C extends A, B {
   ...
}
*/
public class K_Multiple_Interfaces {

	public static void main(String[] args) {
		item2 obj=new item2();
		obj.gettyres(4);
		obj.gettyres1(2);
	}
}
