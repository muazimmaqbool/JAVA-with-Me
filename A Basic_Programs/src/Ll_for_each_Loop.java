// Java for-each Loop
public class Ll_for_each_Loop {
	/*The Java for loop has an alternative syntax that
	makes it easy to iterate through arrays and collections. For example,*/
	public static void main(String[] args) {
		int[] num= {1,3,5,7,9,11,13}; //creating array
		// iterating through the array  using for-each loop
		for(int n:num) {
			System.out.print(n+" ");
		}
		/*Here, we have used the for-each loop to print each element of the numbers array one by one.
		In the first iteration of the loop, n will be 1, n will be 3 in second iteration and so on.*/
		String[] names= {"Muazim","Amir","Danish","Syed Danish","Muntazir","Haseeb","Ikram","Nadeem","Shariq","Feroz","Adil Dagga","Adil"};
		System.out.println();
		for(String Baraderi:names) {	
			System.out.print(Baraderi+" ");
		}
		
		

	}

}
