//Java Nested Static Class
/*We use the keyword static to make our nested class static.
Note: In Java, only nested classes are allowed to be static.*/

//Example: Static Nested Class
class Bike{
	//inner class
	class sportsbike{
		public void display() {
			System.out.println("Inside non-Static Class");
			System.out.println("It's the SportsBike");
		}
	}
	//static class
	static class mountainbike{
		public void display() {
			System.out.println("\nInside Static Class"); 
			System.out.println("It's the MountainBike");
		}
	}
}
public class D_Static_Class {

	public static void main(String[] args) {
		//object creation of the outer class
		Bike obj=new Bike();
		
		// object creation of the non-static class using object of outerclass 
		Bike.sportsbike obj1=obj.new sportsbike();
		obj1.display(); //calling display method of non-static class sportsbike
		
		// object creation of the static nested class using the name of the outer class
		Bike.mountainbike obj2=new Bike.mountainbike();
		obj2.display(); ////calling display method of static class mountainbike

	}

}
