// Java Operators
 class E_Operators {
	public static void main(String[] args) {
		/*Operators are symbols that perform operations on variables and values.
		  For example, + is an operator used for addition, while * is also an operator used for multiplication.
         Operators in Java can be classified into 5 types:
			Arithmetic Operators (+,*,-,/,%) %: gives reminder
			Assignment Operators (=,+=,-=,*=,/=,%=)
			Relational Operators (==,!=,>,<,>=,<=)
			Logical Operators    (&&,||,!)
			Unary Operators    (++,--)
			Bitwise Operators   (~,<<,>>,>>>>,&,^)	 
		 */
		// Arithmetic operators
		// declare variables
	    int a = 12, b = 5;
	    // addition operator
	    System.out.println("a + b = " + (a + b));
	    // subtraction operator
	    System.out.println("a - b = " + (a - b));
	    // multiplication operator
	    System.out.println("a * b = " + (a * b));
	    // division operator
	    System.out.println("a / b = " + (a / b));
	    // modulo operator
	    System.out.println("a % b = " + (a % b));
	    
	    //Assignment Operators
	    int c = 4;
	    int var;
	    // assign value using =
	    var = c;
	    System.out.println("var using =: " + var);
	    // assign value using =+
	    var += c;
	    System.out.println("var using +=: " + var);
	    // assign value using =*
	    var *= c;
	    System.out.println("var using *=: " + var);
	    
	    // Relational Operators
	    int x = 7, y = 11;
	    System.out.println("a is " + x + " and b is " + y);
	    // == operator
	    System.out.println(x == y);  // false
	    // != operator
	    System.out.println(x != y);  // true
	    // > operator
	    System.out.println(x > y);  // false
	    // < operator
	    System.out.println(x < y);  // true
	    // >= operator
	    System.out.println(x >= y);  // false
	    // <= operator
	    System.out.println(x <= y);  // true
	    
	    //Logical Operators

	    // && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false
	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false
	    // ! operator (gives reverse result)
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	    
	    
	    int p=4,q=5;
	    p=+q; // It assigns value of q to p i.e p becomes 5
	    System.out.println("\n"+p); // prints 5
	    p+=q; // it assigns and adds value of q to p i.e p becomes 5+5 = 10
	    System.out.println(p); // prints 10
	    q+=9; // it will add old value of q and 9, so new value q is 5+9= 14
	    System.out.println(q); // prints 14
	    q=+10; // it will assign 1o to q
	    System.out.println(q); //prints 10
	        
	}
}
