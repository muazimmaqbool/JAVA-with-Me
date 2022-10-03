//Java Method Overriding
/*During inheritance in Java, if the same method is present in both the superclass and the subclass. 
Then, the method in the subclass overrides the same method in the superclass. This is called method overriding.
In this case, the same method will perform one operation in the superclass and another operation in the subclass*/

//Example 1: Polymorphism using method overriding
class cycle{
	public void display() {
		System.out.println("the cycle type is: RangerCycle");
	}
}
class subcycle extends cycle{
	@Override //however its not necessary to write @Override
	public void display() {
		System.out.println("This overrides method in superclass");
		System.out.println("The cycle type is: kidsCycle");
	}
}
public class O_Polymorphism {

	public static void main(String[] args) {
		cycle obj1=new cycle();
		obj1.display();//calls method in superclass
		subcycle obj=new subcycle();
		obj.display(); //calls method in subclass which overrides method in superclass
     
		/*Note: The method that is called is determined during the execution of the program. 
		Hence, method overriding is a run-time polymorphism.*/
	}

}
