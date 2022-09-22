// Java Expressions, Statements and Blocks
public class I_Expressions_Statements_Blocks {

	public static void main(String[] args) {
		//Java Expressions
		//Java expression consists of variables, operators, literals, and method calls.
		Double a = 2.2, b = 3.4, result;
		result = a + b - 3.4;
		// Here, a + b - 3.4 is an expression.
		System.out.println(result);
		int number1=5,number2=5;
		if (number1 == number2) 
		     System.out.println("Number 1 is Equal to the number 2");
		/*Here, number1 == number2 is an expression that returns a boolean value. Similarly, 
				"Number 1 is larger than number 2" is a string expression.*/
		
		// Java Statements
		//In Java, each statement is a complete unit of execution. For example
		int score = 9*5;
		System.out.println(score);
		/*Here, we have a statement. The complete execution of this statement involves
		 *  multiplying integers 9 and 5 and then assigning the result to the variable score.
         In the above statement, we have an expression 9 * 5. In Java, expressions are part of statements.*/
		
		/* We can convert an expression into a statement by terminating the expression with a ;. 
		 * These are known as expression statements. For example,*/
			// expression
			//number = 10
			// statement
			//number = 10;
		/* In the above example, we have an expression number = 10. Here, by adding a semicolon (;), 
		 * we have converted the expression into a statement (number = 10;).
			Consider another example,
			// expression
			++number
			// statement
			++number;*/
		//Similarly, ++number is an expression whereas ++number; is a statement.
		
		//Declaration Statements
		//In Java, declaration statements are used for declaring variables. For example,
		Double tax = 9.5;
		///The statement above declares a variable tax which is initialized to 9.5
		


	}

}
