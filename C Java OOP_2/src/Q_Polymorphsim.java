//Polymorphic Variables
/*A variable is called polymorphic if it refers to different values under different conditions.
Object variables (instance variables) represent the behavior of polymorphic variables in Java. 
It is because object variables of a class can refer to objects of its class as well as objects of its subclasses.*/

//Example: Polymorphic Variables
class programminglang{
	public void langName() {
		System.out.println("This line is written in Programming Language");
	}
}
class java extends programminglang{
	//@Override // its not necessary to mention @Override here
	public void langName() {
		System.out.println("and the language used is JAVA");
	}
}
public class Q_Polymorphsim {

	public static void main(String[] args) {
		// declare an object variable
		programminglang p1;
		// create object of ProgrammingLanguage
		p1=new programminglang();
		p1.langName(); // gives output of superclass
		
		// create object of subclass : Java class
		p1=new java();
		p1.langName(); // gives output of subclass 
		
		/*Here, pl is a polymorphic variable. This is because,
		In statement pl = new programmingLang(), pl refer to the object of the programmingLang class.
		And, in statement pl = new java(), pl refer to the object of the java class.
		This is an example of upcasting in Java.*/
		
	}
 //learn //Java Operator Overloading
}
