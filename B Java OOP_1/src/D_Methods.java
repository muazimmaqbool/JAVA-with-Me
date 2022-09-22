//Java Methods examples
class ADD{
	// if it was static : public static int addnumbers(int a, int b) {
	public int addnumbers(int a, int b) { //The method takes two parameters a and b
		int sum=a+b;
		return sum;
		//Here, we are returning the variable sum. Since the return type of the function is int. 
		//The sum variable should be of int type. Otherwise, it will generate an error.
	}	
	
}
 //this method can be called without creating its object as it is static
//Note: The method is not static. Hence, we are calling the method using the object of the class.
//A Java method may or may not return a value to the function call. We use the return statement to return any value
public class D_Methods {
	public static void main(String[] args) {
		int num1=6,num2=5;
		ADD object=new ADD();
		int result=object.addnumbers(num1, num2);//we have called the method by passing two arguments num1 and num2.
		System.out.println("The sum of "+num1+" & "+num2+" is : "+result);
	    // used when addnumbers in ADD class was static : System.out.println(ADD.addnumbers(6, 5));
		
	}
	
}
