//Escape character in Java Strings
public class L_Escap_character {
	public static void main(String[] args) {
		//The escape character is used to escape some of the characters present inside a string.
		//Suppose we need to include double quotes inside a string.
		// include double quote 
		//String example = "This is the "String" class"; //error
		
		//Since strings are represented by double quotes, the compiler will treat "This is the " as the string. 
		//Hence, the above code will cause an error.
		//To solve this issue, we use the escape character \ in Java. For example,
		// use the escape character
		String example = "This is the \"String\" class.";
		System.out.println(example);
		//Now escape characters tell the compiler to escape double quotes and read the whole text.
	}

}
