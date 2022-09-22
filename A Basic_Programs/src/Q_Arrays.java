// Java Arrays
public class Q_Arrays {
	public static void main(String[] args) {
		//An array is a collection of similar types of data.
		//For example, if we want to store the names of 100 people then we can create
		//an array of the string type that can store 100 names.
		// syntax = dataType[] arrayName;
		/* dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
			arrayName - it is an identifier
			For example,
			double[] data;
			Here, data is an array that can hold values of type double.
		 * */
		String[] array = new String[100];
		//Here, the above array cannot store more than 100 names.
		//The number of values in a Java array is always fixed.
		
		// declare an array
		double[] data;
		// allocate memory
		data = new double[10];
		//Here, the array can store 10 elements. We can also say that the size or length of the array is 10.
		// or 
		double[] data1 = new double[10];
		
		//declare and initialize and array
		int[] age = {12, 4, 5, 2, 5};
		
		//In the Java array, each memory location is associated with a number. The number is known as an array index.
		//We can also initialize arrays in Java, using the index number. For example,
		// declare an array
		int[] age1 = new int[5];
		// initialize array
		age[0] = 12;
		age[1] = 4;
		age[2] = 5;
		
		// access array elements
		// array[index]
		
	
		
	}

}
