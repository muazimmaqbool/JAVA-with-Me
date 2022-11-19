//Java enum Constructor
/*In Java, an enum class may include a constructor like a regular class. These enum constructors are either
private - accessible within the class
or
package-private - accessible within the package*/

//Example: enum Constructor
enum laptops{
	// enum constants calling the enum constructors 
	HP("The laptop is Hp."),
	DELL("The laptop is Dell."),
	LENOVO("The laptop is Lenovo."),
	APPLE("The laptop is Apple.");
	private final String brandname;
	
	//private enum constructor
	private laptops(String laptopname) { //private enum constructor
		//The constructor takes a string value as a parameter and assigns value to the variable brandname.
		this.brandname=laptopname;
	}
	public String getlaptop() {
		return brandname;
	}
	/*Since the constructor is private, we cannot access it from outside the class.
	 *  However, we can use enum constants to call the constructor.

	In the Main class, we assigned HP to an enum variable laptops.
	 The constant HP then calls the constructor laptops with string as an argument.

	Finally, we called getlaptop() using laptops.*/
}
public class O_enum_Constructor {
	public static void main(String[] args) {
		laptops obj=laptops.HP;
		System.out.println(obj.getlaptop());
		
	}

}
