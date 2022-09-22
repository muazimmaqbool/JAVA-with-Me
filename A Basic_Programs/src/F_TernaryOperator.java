// Ternary Operator
public class F_TernaryOperator {
   // The ternary operator (conditional operator) is shorthand for the if-then-else statement.
	// variable = Expression ? expression1 : expression2
	public static void main(String[] args) {
	/*Here's how it works.
	If the Expression is true, expression1 is assigned to the variable.
	If the Expression is false, expression2 is assigned to the variable.
	Let's see an example of a ternary operator.*/
		int februarydays=29;
		String result;
	//ternary operator (conditional operator)
		result=(februarydays==28) ? "Leap Year" : "Not a Leap Year";
		System.out.println(result);
		
		int age=19;
		String str=(age>18) ? "Go Right ":"Go Left ";
		System.out.println(str);
	}

}
