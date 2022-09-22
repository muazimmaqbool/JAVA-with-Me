// calling the method without creating the object of the class
class Dd_mthods {
	// create a method
	  public static int square(int num) {
	    // return statement
	    return num * num;
	  }
	public static void main(String[] args) {
		int result;
	    // call the method
	    // store returned value to result
	    result = square(10); // calling the method with the variable and not by the object as it is static
	    System.out.println("Squared value of 10 is: " + result);
        
	    /*Note: If the method does not return any value, we use the void keyword as the return type of the method. For example,

	    		public void square(int a) {
	    		  int square = a * a;
	    		  System.out.println("Square is: " + a);
	    		}*/
	}

}
