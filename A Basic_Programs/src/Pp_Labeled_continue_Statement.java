//Java Labeled continue Statement
public class Pp_Labeled_continue_Statement { 
	public static void main(String[] args) {
		//Till now, we have used the unlabeled continue statement. 
		//However, there is another form of continue statement in Java known as labeled continue.
		/*It includes the label of the loop along with the continue keyword. For example,
		continue label;
		Here, the continue statement skips the current iteration of the loop specified by label.*/
		 // outer loop is labeled as first
		first:
			for(int i=1;i<6;i++) {
				//inner loop
				for(int j=1;j<5;j++) {
					if(i==3 || j==2) {
						// skips the current iteration of outer loop
						continue first;
					}
					 System.out.println("i = "+i+" ; j = "+j);
				}
			}
	}

}
