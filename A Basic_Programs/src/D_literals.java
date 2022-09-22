// Literals : Literals are data used for representing fixed values. They can be used directly in the code
public class D_literals {
	public static void main(String[] args) {
		int a = 1;
		float b = (float) 2.5 ;
		char c = 'F'; // Here, 1, 2.5, and 'F' are literals.
		
	/*Boolean Literals : boolean literals are used to initialize boolean data types. 
		They can store two values: true and false. For example,*/
		boolean flag1 = false;
		boolean flag2 = true;
		// false and true are two boolean literals
	
	/*Integer Literals : An integer literal is a numeric value(associated with numbers) 
	 * without any fractional or exponential part. There are 4 types of integer literals in Java:
			binary (base 2)
			decimal (base 10)
			octal (base 8)
			hexadecimal (base 16)
			For example:*/
			// binary
			int binaryNumber = 0b10010;
			// octal 
			int octalNumber = 027;
			
			// decimal
			int decNumber = 34;
			
			// hexadecimal 
			int hexNumber = 0x2F; // 0x represents hexadecimal
			// binary
			int binNumber = 0b10010; // 0b represents binary
			System.out.println(binNumber);
			
	/*Floating-point Literals: A floating-point literal is a numeric literal that 
	 * has either a fractional form or an exponential form. For example,
	 */
 // Note: The floating-point literals are used to initialize float and double type variables.
			double myDouble = 3.4;
		    float myFloat = 3.4F;
		    // 3.445*10^2
		    double myDoubleScientific = 3.445e2;
		    System.out.println(myDouble);  // prints 3.4
		    System.out.println(myFloat);    // prints 3.4
		    System.out.println(myDoubleScientific);   // prints 344.5
		    
    // Character Literals: Character literals are unicode character enclosed inside single quotes. 
      char letter='a';
      char letter1 = '\u0051'; // will print Q
      System.out.println(letter);
      System.out.println(letter1);
      /* Here, a is the character literal.
		We can also use escape sequences as character literals. For example,
		 \b (backspace), \t (tab), \n (new line), etc.*/
      
    //String literals: A string literal is a sequence of characters enclosed inside double-quotes
      String str1 = "Muazim";
      String str2 = "Maqbool";            
      // Here, Muazim and Maqbool are two string literals.
      System.out.println("\t"+str1+" "+str2); // prints        Muazim Maqbbol "\t" gives tab/space
      
      // Study more about java datatypes from https://www.programiz.com/java-programming/variables-primitive-data-types

	}
}
