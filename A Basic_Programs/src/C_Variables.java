// A variable is a location in memory (storage area) to hold data.
//To indicate the storage area, each variable should be given a unique name (identifier).
 class C_Variables {
	public static void main(String[] args) {
		// creating variable
       int speedlimit= 80; //speedlimit is a variable of int data type and we have assigned value 80 to it.
       /*
        * Note: Java is a statically-typed language. 
        * It means that all variables must be declared before they can be used.
        */
       speedlimit = 90; // initially, the value of speedLimit is 80. Later, we changed it to 90.
       //we cannot change the data type of a variable in Java within the same scope.
       //variable scope: Scope of a variable is the part of the program where the variable is accessible.
       System.out.println(speedlimit);
       int age=22;
       System.out.println(age);
       //Points to remember while naming variable names
       /* -> Java is case sensitive. Hence, age and AGE are two different variables.
        * -> Variables must start with either a letter or an underscore, _ or a dollar: $ sign
        * -> Variable names cannot start with numbers
        * -> Variable names can't use whitespace.
        * -> If you choose one-word variable names, use all lowercase letters. For example, it's better to use speed rather than SPEED, or sPEED.
        */ 
       

	}

}
