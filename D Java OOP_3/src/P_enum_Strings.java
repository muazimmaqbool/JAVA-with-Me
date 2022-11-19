//Java enum Strings
//In Java, we can get the string representation of enum constants using the toString() method or the name() method.
enum length{
	SMALL,MEDIUM,LARGE,EXTRALARGE
	
}
public class P_enum_Strings {

	public static void main(String[] args) {
		System.out.println("String value of MEDIUM is: "+length.MEDIUM.toString());
		System.out.println("String value of LARGE is: "+length.LARGE.name());
	}

}
