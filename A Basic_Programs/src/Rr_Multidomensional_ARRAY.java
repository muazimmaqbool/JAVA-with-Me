//Multidimensional Arrays
public class Rr_Multidomensional_ARRAY {
	public static void main(String[] args) {
		//Print all elements of 2d array Using Loop
		int[][] a= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.print("printing using for loop");
		for(int i=0;i<a.length;i++) {
			System.out.print("\n");
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+","); //System.out.print(a[i][j]+",");
			}
		}
		//using the for...each loop to access elements of the multidimensional array.
		//first for...each loop access the individual array
		System.out.print("\nNow printing using for each loop");
		for(int[] innerarray:a) {
			System.out.print("\n");
			// second for...each loop access each element inside the row
			for(int data:innerarray) {
				System.out.print(data+",");
			}
		}
		
		System.out.print("\nPrinting 3D using for each loop");
        //How to initialize a 3d array in Java?
		int [][][] _3darray={
		        {
		            {1, -2, 3}, 
		            {2, 3, 4}
		          }, 
		          { 
		            {-4, -5, 6, 9}, 
		            {1}, 
		            {2, 3}
		          }
		          };
		//Basically, a 3d array is an array of 2d arrays. 
		//The rows of a 3d array can also vary in length just like in a 2d array.
		for(int[][] array2D:_3darray) {
			for(int[] array1D:array2D) {
				System.out.print("\n");
				for(int item:array1D) {
					System.out.print(item+",");
				}
			}
		}
		
	}

}
