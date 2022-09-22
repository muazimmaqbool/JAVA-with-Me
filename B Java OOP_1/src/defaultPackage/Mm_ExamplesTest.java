package defaultPackage;
//checking if in this program , can we access a method of "M_Access_Modifiers" class since they both have have package 
// "defaultPackage"
public class Mm_ExamplesTest {
       
	public static void main(String[] args) {
		//calling method in "M_Access_Modifiers" class from here in "Mm_ExamplesTest" class
		// if its static use : classname.methodname();
		// if its not static use : create object of the class you want to access in other class then call its methods
		// by its object.methodname(); from another class
		M_Access_Modifiers obj1=new M_Access_Modifiers();
		obj1.message();

	}

}
