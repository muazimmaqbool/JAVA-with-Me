//Java Polymorphism
//Polymorphism is an important concept of object-oriented programming. It simply means more than one form.
//That is, the same entity (method or operator or object) can perform different operations in different scenarios.

//Example: Java Polymorphism
class printer{
	public void type() {
		System.out.println("The type of printer is Dot_matrix printer");
	}
}
class nonImpact extends printer{
	public void type() {
		System.out.println("The type of printer is Laser printer");
	}
}
class impact extends printer{
	public void type() {
		System.out.println("The type pf printer is daisy wheel printer");
	}
}
public class N_Polymorphism {

	public static void main(String[] args) {
		impact obj=new impact();
		obj.type();
		nonImpact obj1=new nonImpact();
		obj1.type();
		printer obj2=new printer();
		obj2.type();
	/*	
	The main purpose of the type() method is to tell the type of printer.
    However, the process of type method is different than the process of type method a nonImpact class.
    Hence, the type() method behaves differently in different classes. Or, we can say type() is polymorphic.*/
    
		/*Why Polymorphism?
		Polymorphism allows us to create consistent code. In the previous example, 
		we can also create different methods: typeimpact() and typenonImpact() 
		to  impact and nonImpact classes, respectively.
		
		This will work perfectly. However, for every type, we need to create different methods. 
		It will make our code inconsistent.
		
		To solve this, polymorphism in Java allows us to create a single method render()
		that will behave differently for different shapes.
		Note: The print() method is also an example of polymorphism.
		It is used to print values of different types like char, int, string, etc.*/


	}

}
