//Java enum Class
/*In Java, an enum (short for enumeration) is a type that has a fixed set of constant values. 
We use the enum keyword to declare enums. For example,
enum Size { 
   SMALL, MEDIUM, LARGE, EXTRALARGE 
}
These values inside the braces are called enum constants (values).
Note: The enum constants are usually represented in uppercase.
*/
//Example 1: Java Enum
enum Size{
	SMALL, MEDIUM, LARGE, EXTRALARGE
}
public class K_enumsClass {
	public static void main(String[] args) {
		System.out.println(Size.SMALL);
		System.out.println(Size.LARGE);
	}

}
