//final keyword
//the final keyword is used to denote constants. It can be used with variables, methods, and classes.
/*Once any entity (variable, method or class) is declared final, it can be assigned only once. That is,
the final variable cannot be reinitialized with another value
the final method cannot be overridden
the final class cannot be extended*/
public class T_finalkeyword {
	public static void main(String[] args) {
		final int age=22; //final variable
		// tried to change the final variable
		//age=32; //if using this it will show error because final variable cannot be modified again
		System.out.println(age);
		
	}

}
