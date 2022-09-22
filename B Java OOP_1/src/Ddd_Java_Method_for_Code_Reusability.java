//Java Method for Code Reusability
class Ddd_Java_Method_for_Code_Reusability {
	/*The main advantage is code reusability. We can write a method once, and use it multiple times.
	We do not have to rewrite the entire code each time. Think of it as, "write once, reuse multiple times".*/
		//Java Method for Code Reusability
	public static int getsquare(int x) {
		return x*x;
	}
	public static void main(String[]args) {
		for(int i=1;i<10;i++) {
			//method call
			int result=getsquare(i);
			System.out.println("The square root of "+i+" is: "+result);
		}
	}
	/*n the above program, we have created the method named getSquare() to calculate the square of a number. 
	 * Here, the method is used to calculate the square of numbers less than 10.
	 * Hence, the same method is used again and again.
      2. Methods make code more readable and easier to debug.
       Here, the getSquare() method keeps the code to compute the square in a block.
       Hence, makes it more readable.*/
	

}
