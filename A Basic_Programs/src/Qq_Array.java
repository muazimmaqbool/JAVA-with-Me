//Java Arrays continue from previous program
public class Qq_Array {
	public static void main(String[] args) {
		
		//Example: Access Array Elements
       int[] age= {12,18,16,21,25,26}; // create an array
       // access each array elements
       System.out.println("Accessing Elements of Array:");
       System.out.println("First Element :"+age[0]);
       System.out.println("Second Element :"+age[1]);
       System.out.println("Third Element :"+age[2]);
       System.out.println("Forth Element :"+age[3]);
       System.out.println("Fifth Element :"+age[4]);
       System.out.println("Sixth Element :"+age[5]);
       
       //Looping Through Array Elements
       char[] vowels= {'a','e','i','o','u'};
       System.out.println("looping through array using for loop");
       for(int i=0;i<vowels.length;i++) {
    	   System.out.print(vowels[i]+" ");
       }
       System.out.println();
       //Using the for-each Loop
       String[] names= {"Muazim","Danish","Syed Danish","Haseeb"};
       for(String items:names) {
    	   System.out.print(items+" ");
       }
       
       //Compute Sum and Average of Array Elements
       int[] numbers= {1,2,3,11,33,44,5,667,898,6655,90,9,13};
       int sum=0;
       double average;
      // access all elements using for each loop
       for(int n:numbers) {
    	   sum+=n;	   // adding each element in sum
       }
       //get the total number of elements
       int arraylength=numbers.length;
       // calculate the average
       // convert the average from int to double
       average=((double)sum/(double)arraylength); // average=sum of elements/no.of elements
       System.out.println("\nSum = "+sum);
       System.out.println("Average = "+average);
	}
}
