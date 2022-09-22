import java.util.Scanner;

//Java switch Statement
//The switch statement allows us to execute a block of code among many alternatives.
public class K_switch_Statement {
	//The syntax of the switch statement in Java is:
/*    switch (expression) {
      case value1:
	    // code
	    break;
	  case value2:
	    // code
	    break;
	  ...
	  ...
	  default:
	    // default statements
	  }*/
	public static void main(String[] args) {
		/*How does the switch-case statement work?
			The expression is evaluated once and compared with the values of each case.
			If expression matches with value1, the code of case value1 are executed. Similarly, 
			the code of case value2 is executed if expression matches with value2.
			If there is no match, the code of the default case is executed.*/
		Scanner value=new Scanner(System.in);
		System.out.println("Enter Your Semester");
		System.out.println("Enter exit to quit");
		String sem=value.next();
		int NoofBooks = 0;
		switch(sem) {
		case "ist":
			NoofBooks=7;
			break;
		case "2nd":
			NoofBooks=6;
			break;
		case "3rd":
			NoofBooks=5;
			break;
		case "4th":
			NoofBooks=4;
			break;
		case "5th":
			NoofBooks=4;
			break;
		case "6th":
			NoofBooks=4;
			break;
		case "7th":
			NoofBooks=3;
			break;// if breaK IS NOT USED ,  if case 7th is executed then all the cases after 7th will also execute , thats why we are using break
		case "8th":
			NoofBooks=3;
			break;
		case "exit":
			System.exit(0); //used to exit/end the program
		default: //It is executed when the expression doesn't match any of the cases
			System.out.println("Enter Correct Value");
			break;
		}	
		System.out.println(NoofBooks);
		/*The break statement is used to terminate the switch-case statement. 
		 * If break is not used, all the cases after the matching case are also executed*/
		
	}
}
