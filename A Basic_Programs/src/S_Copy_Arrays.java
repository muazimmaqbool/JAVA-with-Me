import java.util.Arrays;

// Java Copy Arrays
public class S_Copy_Arrays {
	public static void main(String[] args) {
		//In Java, we can copy one array into another. 
		//There are several techniques you can use to copy arrays in Java.
		// Copying Arrays Using Assignment Operator(=)
		int[] num= {1,2,3,4,5};
		int[] positiveNumbers=num; // now elements of num will be also in positiveNumbers
		for(int n:positiveNumbers) {
			System.out.print(n+",");
			//In the above example, 
			//we have used the assignment operator (=) to copy an array named numbers 
			//to another array named positiveNumbers.
		}
		System.out.println("\nNow updating num at index 1 to 6 ( so 2 changed to 6)");
		/*This technique is the easiest one and it works as well. However, 
		 * there is a problem with this technique. 
		 * If we change elements of one array, corresponding elements of 
		 * the other arrays also change. 
		 * It's because both arrays refer to the same array object.
		 *  This is because of the shallow copy. 
		 *  For example,*/
		num[1]=6; // assigning 6 and index of 1 of array num
		for(int n:positiveNumbers) {
			System.out.print(n+",");
		}
		
		System.out.print("\nCopying array using for loop iteration\n");
		//Using Looping Construct to Copy Arrays
		//Here, the source and destination array refer to different objects (deep copy). 
		//Hence, if elements of one array are changed, corresponding elements of another array is unchanged.
		
		int[] source= {6,6,5,5};
		System.out.println("Elements in array Source :"+Arrays.toString(source));
		int[] destination=new int[4];
		System.out.println("Elements in array destination :"+Arrays.toString(destination));
		
		//source[3]=6; // if you change element of source here it will also change in destination
		// because its not assigned to destination yet
		
		// iterate and copy elements from source to destination
		for(int i=0;i<source.length;i++) {
			destination[i]=source[i]; // copying elements in source to destination
		}
		
		//source[3]=6; // changing element of source here wont change/effect in destination because 
		// source is assigned to destination, but it will change in source
		//System.out.println("Elements in array Source :"+Arrays.toString(source));
		
		// converting array to string
		System.out.println("Now elements in destination "+Arrays.toString(destination));
		//Here, the toString() method is used to convert an array into a string.
	 //
	}

}
