//Example 3: Java Enum Class
//An enum class can include methods and fields just like regular classes.
enum brand{
	Apple,Samsung, MI,OPPO,Google;
	public String getbrand() {
		switch(this) { //this will refer to the values of enum brand
		case Apple:
			return "APPLE";
		case Samsung:
			return "Samsung";
		case MI:
			return "Mi";
		case OPPO:
			return "Oppo";
		case Google:
			return "Google";
		default:
			return null;
		}
	}
}
//Since brand is an enum class, the compiler automatically creates instances for each enum constants.
public class M_Enum {

	public static void main(String[] args) {
		 // call getbrand()
	    // using the object OPPO
		System.out.println("The brand name is: "+brand.OPPO.getbrand());
//Here inside the main() method, we have used the instance OPPO to call the getbrand() method.
		//Note: Like regular classes, an enum class also may include constructors.
	}

}
