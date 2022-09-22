//Labeled break Statement
public class Oo_Labeled_break_Statement {
	public static void main(String[] args) {
		/*Till now, we have used the unlabeled break statement. It terminates the 
		 * innermost loop and switch statement. However, there is another form of break statement in Java known as the labeled break.
		We can use the labeled break statement to terminate the outermost loop as well.
		 * */
		// the for loop is labeled as first
		first:
	    for(int i=1;i<5;i++) {
	    	// the for loop is labeled as first
	    	second:
	    		for(int j=1;j<3;j++) {
	    			System.out.println("i = "+i+" j = "+j);
	    			if(i==2) {
	    				break first; // breaks when i becomes 2
	    			   }	       
	    			}
	    }
	System.out.println("New Example ");
	   third:
		   for(int m=1;m<6;m++){
			   fourth:
				   for(int n=1;n<4;n++) {
					   System.out.println("m = "+m+" n = "+n);
					   if(n==2) {
						   break fourth; // when n==2 it breaks it and again executes third for loop
					   }
				   }
		   }
	}

}
