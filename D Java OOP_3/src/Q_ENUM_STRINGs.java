//Change Default String Value of enums
//We can change the default string representation of enum constants by overriding the toString() method.
enum STRsize{
	SMALL{
		// overriding toString() for SMALL
	    public String toString() {
	        return "The size is small.";
	}
},
	MEDIUM{
	//overriding toString() for MEDIUM|
	public String toString() {
		return "The size is medium";
	}
	
},
	LARGE
}	
/*In the above program, we have created an enum STRsize. And we have overridden the toString()
method for enum constants SMALL and MEDIUM.
Note: We cannot override the name() method. It is because the name() method is final.*/
public class Q_ENUM_STRINGs {

	public static void main(String[] args) {
		System.out.println(STRsize.MEDIUM.toString());

	}

}
