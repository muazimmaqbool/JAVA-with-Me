//Java Access Modifiers
//In Java, access modifiers are used to set the accessibility (visibility) of classes, interfaces, variables,
//methods, constructors, data members, and the setter methods.
	//public - This means it can be accessed by other classes.
	//private - This means it can not be accessed by other classes.
	//Note: You cannot set the access modifier of getters methods.
	
	/*Default 	declarations are visible only within the package (package private)
	Private	declarations are visible within the class only
	Protected	declarations are visible within the package or all subclasses
	Public	declarations are visible everywhere*/
package defaultPackage;
public class M_Access_Modifiers {
	     void message() {
	    	 System.out.println("This is message");
	     }
	public static void main(String[] args) {	
		M_Access_Modifiers obj=new M_Access_Modifiers();
		obj.message();
		/*Here, the M_Access_Modifiers class has the default access modifier. 
		 * And the class is visible to all the classes that belong to the defaultPackage package.
		 *  However, if we try to use the M_Access_Modifiers class in another class outside of defaultPackage, 
		 *  we will get a compilation error.*/
	}
}
