//private and static Methods in Interface
//Similar to a class, we can access static methods of an interface using its references.
// create an interface
/*interface Polygon {
  staticMethod(){..}
}

// access static method
Polygon.staticMethod();*/
/*We cannot create objects of an interface.
Hence, private methods are used as helper methods that provide support to other methods in interfaces.*/

//Practical Example of Interface
import java.lang.Math;
interface Polygon999{
	void getarea();
	// calculate the perimeter of a Polygon
	default void getperimeter(int... sides) {
		int perimeter=0;
		for(int s:sides) {
			perimeter+=s;
		}
		System.out.println("Perimeter: "+perimeter);
	}
}
class triangle implements Polygon999{
	private int a,b,c;
	private double s,area;
	// initializing sides of a triangle
	triangle(int a,int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
		s=0;
	}
	// calculate the area of a triangle
	public void getarea() {
		s=(double)(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area: "+area);
		}
	
}
public class M_Interface {
	
	public static void main(String[] args) {
		triangle t1=new triangle(2,3,4);
		t1.getarea();
		t1.getperimeter(2,3,4);

	}

}
