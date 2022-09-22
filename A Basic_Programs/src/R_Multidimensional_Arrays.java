//Java Multidimensional Arrays
public class R_Multidimensional_Arrays {
	public static void main(String[] args) {
		//Arrays we have mentioned till now are called one-dimensional arrays. 
		//However, we can declare multidimensional arrays in Java.
		//A multidimensional array is an array of arrays. That is, each element of 
		//a multidimensional array is an array itself. For example,
		double[][] matrix = {{1.2, 4.3, 4.0}, 
			      {4.1, -1.1}};
		int[][] a = new int[3][4];
		//Here, we have created a multidimensional array named a.
		//It is a 2-dimensional array, that can hold a maximum of 12 elements,
	
		//This time we will be creating a 3-dimensional array. For example,
		String[][][] data = new String[3][4][2];
		//Here, data is a 3d array that can hold a maximum of 24 (3*4*2) elements of type String.
		
		//How to initialize a 2d array in Java?
		int[][] num = {
			      {1, 2, 3}, 
			      {4, 5, 6, 9}, 
			      {7}, 
			};
		//Example: 2-dimensional Array
		 // create a 2d array
		int[][] num1= {{1, 2, 3}, 
			      {4, 5, 6, 9}, 
			      {7},};
		// calculate the length of each row
		System.out.println("Lenght of Row 1 : "+num1[0].length);
		System.out.println("Lenght of Row 2 : "+num1[1].length);
		System.out.println("Lenght of Row 3 : "+num1[2].length);
		
	}

}
