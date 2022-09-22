//Java for-each Loop again in details
public class Llll_for_each_Loop_2 {
	public static void main(String[] args) {
		/*The syntax of the Java for-each loop is:
			for(dataType item : array) {
			    ...
			}
			array - an array or a collection
			item - each item of array/collection is assigned to this variable
			dataType - the data type of the array/collection*/
		//print array elements
		int[] numbers = {3, 9, 5, -5};
		String[] names= {"Muazim","Amir","Danish","Syed Danish","Muntazir","Haseeb","Ikram","Nadeem","Shariq","Feroz","Adil Dagga","Adil"};
		for(int item:numbers) {
			System.out.print(item+" ");
		}
		System.out.println();
		for(String item1:names) {
			System.out.print(item1+" ");
		}
		
		//Sum of Array Elements
		int[] num= {1,2,3,4,5,6,7,8,9,10}; 
		int[] num1 = {3, 4, 5, -5, 0, 12};
		int sum=0;
		for(int n:num1) {
			sum+=n;
		}
		System.out.println("\n"+sum);
	}

}
