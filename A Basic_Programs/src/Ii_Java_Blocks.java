//Java Blocks
//A block is a group of statements (zero or more) that is enclosed in curly braces { }
public class Ii_Java_Blocks {
	public static void main(String[] args) {
		String Shop="Open";
		if(Shop=="Open") {//Start of Block
			System.out.println("I want to buy :\nApples,Oranges and Bananas");	
			System.out.println("And Recharge my Mobile Number");
		}//End of Block
		//In the above example, we have a block if {....}.
		//Here, inside the block we have two statements:
		/*System.out.println("I want to buy :\nApples,Oranges and Bananas");	
			System.out.println("And Recharge my Mobile Number");*/
		//However, a block may not have any statements. Consider the following examples,
		if (10 > 5) { // start of block		 
        } // end of block
		//This is a valid Java program. Here, we have a block if {...}. However, there is no any statement 
		//inside this block.
		
		/* public static void main(String[] args) {  // start of block 	

		    } // end of block
		
		Here, we have block public static void main() {...}. However, 
		similar to the above example, this block does not have any statement.*/
		
	}

}
