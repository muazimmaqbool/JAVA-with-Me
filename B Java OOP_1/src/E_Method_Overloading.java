//Java Method Overloading
 class E_Method_Overloading {
		/*In Java, two or more methods may have the same name if they differ in parameters
		 *  (different number of parameters, different types of parameters, or both). 
		These methods are called overloaded methods and this feature is called method overloading. For example:
			void func() { ... }
			void func(int a) { ... }
			float func(double a) { ... }
			float func(int a, float b) { ... }*/
		//Here, the func() method is overloaded. These methods have the same name but accept different arguments.
		//The return types of the above methods are not the same. It is because method overloading is not associated with return types. 
		//Overloaded methods may have the same or different return types, but they must differ in parameters.
	
		//Overloading by changing the number of parameters
	 private static void display(int a) {
		 System.out.println("Arguments: "+a);
	 }
	 private static void display(int a,int b) {
		 System.out.println("Arguments: "+a+" , Arguments: "+b);
	 }
	 //Method Overloading by changing the data type of parameters
	 private static void display(String str) {
		 System.out.println("Got the string :"+str);
	 }
	 public static void main(String[] args) {
		 display(1);
		 display(2,3);
		 display("String Argument");
	}
}
