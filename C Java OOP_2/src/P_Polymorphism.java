//Java Method Overloading
/*In a Java class, we can create methods with the same name if they differ in parameters. For example,
void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) { ... }
This is known as method overloading in Java.
Here, the same method will perform different operations based on the parameter.*/

//Example 3: Polymorphism using method overloading
class Pattern{
	// method without parameter
	public void run() {
		System.out.println("method without parameter prints even number upto 10");
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	// method with single parameter
	public void run(char symbol) {
		System.out.println("\nmethod with single parameter prints your symbol");
		for(int i=0;i<10;i++) {
			System.out.print(symbol+" ");
		}
	}
}
public class P_Polymorphism {

	public static void main(String[] args) {
		Pattern obj=new Pattern();
		// call method without any argument
		obj.run();
		// call method with a single argument
		obj.run('#');
	}
	//Note: The method that is called is determined by the compiler. 
	//Hence, it is also known as compile-time polymorphism.

}
