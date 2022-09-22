//Java instanceof Operator
//The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.
//Its syntax is = objectName instanceOf className;
//Here, if objectName is an instance of className, the operator returns true. Otherwise, it returns false.
public class W_instanceofOperator {
	
	public static void main(String[] args) {
		String name="java"; //In Java, String is a class rather than a primitive data type like int(int is not the class)
		// checks if name is instance of String
		boolean result1=name instanceof String;
		System.out.println("is name an instance of String: "+result1);
		
		W_instanceofOperator obj=new W_instanceofOperator ();
		 // checks if obj is an instance of Main
		boolean result2=obj instanceof  W_instanceofOperator;
		System.out.println("is obj an instanceof W_instanceofOperator class: "+result2);
		
		
	}

}
