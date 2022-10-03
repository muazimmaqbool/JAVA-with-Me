//Java Abstraction
/*The major use of abstract classes and methods is to achieve abstraction in Java.
Abstraction is an important concept of object-oriented programming that 
allows us to hide unnecessary details and only show the needed information.

This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.
A practical example of abstraction can be motorbike brakes. 
We know what brake does. When we apply the brake, the motorbike will stop. However, 
the working of the brake is kept hidden from us.
The major advantage of hiding the working of the brake is 
that now the manufacturer can implement brake differently for different motorbikes, however, 
what brake does will be the same.*/
abstract class motorbike{
	abstract void brake(); //The brake() method cannot be implemented inside MotorBike because its abstract method
}
class sportsbike extends motorbike{
	public void brake() { // implementation of abstract method
		System.out.println("SportsBike Brake System");
	}
	public void num() { // implementation of abstract method
		System.out.println("Number of gears in SportsBike are: 5");
	}
}
class mountainbike extends motorbike{
	public void brake() {
		System.out.println("Mountain Brake System");
	}
//Here, MountainBike makes its own implementation of brake() and SportsBike makes its own implementation of brake()
	public void num() { // implementation of abstract method
		System.out.println("Number of gears in MotorBike are: 6");
	}
}
public class H_Java_Abstraction {
	public static void main(String[] args) {
		sportsbike obj=new sportsbike();
		mountainbike obj1=new mountainbike();
		obj.brake();
		obj.num();
		obj1.brake();
		obj1.num();
	}

}
