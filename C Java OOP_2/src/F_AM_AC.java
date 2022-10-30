//Java Abstract Class and Abstract Methods
//Implementing Abstract Methods
/*If the abstract class includes any abstract method, 
then all the child classes inherited from the abstract superclass must provide the implementation 
of the abstract method*/
abstract class car{
	abstract void type(); //if we try to create its body here it will show error as 
	//we don't create its body here because its abstract , but we must create its body in its subclass
	public void Gears() {
		System.out.println("No. of Gears are: 6");
	}
}
class cartype extends car{
	// provide implementation of abstract method
	void type() {
		System.out.println("Automatic");
	}
	/*Note: If the cartype class doesn't provide the implementation of the abstract method type(),
	cartype should also be declared as abstract. 
	This is because the subclass cartype type() from car.*/

	
}
public class F_AM_AC {

	public static void main(String[] args) {
		cartype car1=new cartype();
		car1.Gears();
		car1.type();

	}

}
