// Copying Arrays Using arraycopy() method
import java.util.Arrays;
public class Ss_CopyArray {

	public static void main(String[] args) { 
	 //In Java, the System class contains a method named arraycopy() to copy arrays. 
	//This method is a better approach to copy arrays than the previous two(on S_Copy_Arrays program).
		//The arraycopy() method allows you to
		//copy a specified portion of the source array to the destination array.
		//For example
		 // arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
		
		/* Here,
		src - source array you want to copy
		srcPos - starting position (index) in the source array
		dest - destination array where elements will be copied from the source
		destPos - starting position (index) in the destination array
		length - number of elements to copy
		Let's take an example: */
		int[] n1= {0,1,2,3,4,5};
		System.out.println("n1 = "+Arrays.toString(n1));
		// Creating n2 array of having length of n1 array
		int[] n2=new int[n1.length];
		System.out.println("n2 = "+Arrays.toString(n2));
		// copying entire n1 array to n2
		System.arraycopy(n1,0,n2,0,n1.length);
		System.out.println("n2 = "+Arrays.toString(n2));
		
		int[] n3=new int[5];
		System.out.println("n3 = "+Arrays.toString(n3));
		// copying elements from index 2 of n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
		System.out.println(" copying elements from index 2 of n1 array"
				+ ", copying element to index 1 of n3 array"
				+ ", 2 elements will be copied");
		System.arraycopy(n1,2,n3,1,2);
		System.out.println("n3 = "+Arrays.toString(n3));
		
	   //System.arraycopy(n1, 2, n3, 1, 2) - 2 elements of the n1 array starting from
       //index 2 are copied to the index starting from 1 of the n3 array
		
		// Copying Arrays Using copyOfRange() method
		System.out.println("Copying array using copyofrange");
		 int[] source = {2, 3, 12, 4, 12, -2};
		 System.out.println("Source = "+Arrays.toString(source));
		// copying entire source array to destination
		 int[] destination=Arrays.copyOfRange(source,0,source.length);
		 System.out.println("Destination = "+Arrays.toString(destination));
		// copying from index 2 to 5 (5 is not included)
		 System.out.println("copying from index 2 to 5 (5 is not included)");
		 int[] destination1=Arrays.copyOfRange(source,2,5); // 12,4,12 will of copied
		 System.out.println("Destination 1 = "+Arrays.toString(destination1)); 
		 
		 //Copying 2d Arrays Using Loop
		 int[][] source1 = {
	              {1, 2, 3, 4}, 
	              {5, 6},
	              {0, 2, 42, -4, 5}
	              };
		 int[][] destination2=new int[source1.length][];
		 for(int i=0;i<destination2.length;++i) {
			// allocating space for each row of destination array
	            destination2[i] = new int[source1[i].length];
	            for(int j=0;j<destination2[i].length;++j) {
	            	destination2[i][j]=source1[i][j];	
	            }
		 }
		 //displaying destination array
	        System.out.println(Arrays.deepToString(destination2)); 
	        //Here, the deepToString() method is used to provide a better representation
            //of the 2-dimensional array.
	      
	        //Copying 2d Arrays using arraycopy()
           	//To make the above code more simpler,
	        //we can replace the inner loop with System.arraycopy() as in the case 
	        //of a single-dimensional array. For example,
	        int[][] source2 = {
	                {1, 2, 3, 4}, 
	                {5, 6},
	                {0, 2, 42, -4, 5}
	                };
	        int[][] destination3 = new int[source2.length][];
	        for(int i=0;i<source2.length;i++) {
	        	// allocating space for each row of destination array
	        	destination3[i]=new int[source2[i].length];
	        	System.arraycopy(source2[i],0,destination3[i],0,destination3[i].length);
	        	 // or
	        	//System.arraycopy(source2[i],0,destination3[i],0,source2[i].length);
	        
	        }
	        // displaying destination array
	        System.out.println(Arrays.deepToString(destination3));      
	        

	}

}
