//Private Access Modifier
class data{
	//private variable
	private String name;
}
//When variables and methods are declared private, they cannot be accessed outside of the class
public class N_Private_AM {
	public static void main(String[] args) {
		//creating object of class data
		data obj=new data();
		// access private variable and field from another class
		obj.name="Java"; // error
//The error is generated because we are trying to access the private variable of the Data class 
		//from the "N_Private_AM" class.
		//if we need to access those private variables. In this case, we can use the getters and setters method
		//see getters and setters in next program
	}

}
