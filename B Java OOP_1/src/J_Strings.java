//Java Strings
//a string is a sequence of characters. 
//For example, "hello" is a string containing a sequence of characters 'h', 'e', 'l', 'l', and 'o'.
public class J_Strings {
	public static void main(String[] args) {
		// create a string
		String lang = "Java programming";
		String name="Muazim Maqbool"; //without space its length is 13 and with space its length is 14
		// print strings
	    System.out.println("lang: "+lang);
	    System.out.println("name: "+name);
	    
	    // Get length of a String
	    //To find the length of a string, we use the length() method of the String
	    int length=name.length(); //it also counts space
	    System.out.println("Length of String name: "+length);
	    
	    //Join Two Java Strings
	    String str1="Computer";
	    System.out.println("Str1: "+str1);
	    String str2="Science";
	    System.out.println("Str2: "+str2);
	    // join two strings
	    String joinstrings=str1.concat(str2);
	    System.out.println("Str1 + Str2: "+joinstrings);
	    int length1=joinstrings.length();
	    System.out.println("Lenght of computerscience: "+length1);
	    
	    // Compare two Strings
	   // compare str1 and str2 strings
	    boolean result=str1.equals(str2);
	    System.out.println("Strings Str1 and Str2 are equal: " + result);
	    String str3="Computer"; //Computer and computer are different
	    System.out.println("Str3: "+str3);
	    boolean result1=str1.equals(str3);
	    System.out.println("Strings Str1 and Str3 are equal: " + result1);
	    //The equals() method checks the content of strings while comparing them. 
	    
	    //Java Strings are Immutable
	    //strings are immutable. This means, once we create a string, we cannot change that string.
	    String str="Laptop";
	    System.out.println("Value of str: "+str);
	    //Here, we have created a string variable named example. The variable holds the string "laptop ".
	    
	    //Now suppose we want to change the string.
	    // add another string "Desktop" to the previous String example // So str becomes = LaptopDesktop
	    str=str.concat("Desktop");
	    System.out.println("New value of str(changed using concat): "+str); //o/p = LaptopDesktop
	   //Here, we are using the concat() method to add another string Word to the previous string.
	    //It looks like we are able to change the value of the previous string. However, this is not true.
	    
	    /*Let's see what has happened here,
	    JVM takes the first string "Laptop"
	    creates a new string by adding "Desktop" to the first string
	    assign the new string "LaptopDesktop" to the str variable
	    the first string "Laptop" remains unchanged*/
	    
	    //Creating strings using the new keyword
	   // Since strings in Java are objects, we can create strings using the new keyword as well. For example,
	 // create a string using the new keyword
	    String brand= new String("Apple");
	    System.out.println("Value of String created using new keyword: "+brand);
	    //In the above example, we have created a string name using the new keyword.
	    //Here, when we create a string object, the String() constructor is invoked. 
	    
       //Create String using literals vs new keyword
	    //In Java, the JVM maintains a string pool to store all of its strings inside the memory. 
	    //The string pool helps in reusing the strings.
	    //1. While creating strings using string literals,
	    //String example1 = "Java";
	    //Here, we are directly providing the value of the string (Java). 
	    //Hence, the compiler first checks the string pool to see if the string already exists.
	    //If the string already exists, the new string is not created. 
	    //Instead, the new reference, example points to the already existed string (Java).
	    //If the string doesn't exist, the new string (Java is created).
	    
	    //2. While creating strings using the new keyword,
	    //String example2 = new String("Java");
	    //Here, the value of the string is not directly provided. 
	    //Hence, a new "Java" string is created even though "Java" is already present inside the memory pool.
	}

}
