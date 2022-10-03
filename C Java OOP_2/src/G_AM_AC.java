//Java abstract class and abstract method
//Accesses Constructor of Abstract Classes
//An abstract class can have constructors like the regular class. 
//And, we can access the constructor of an abstract class from the subclass using the super keyword.
abstract class mobile{
	String name;
	mobile(){
		System.out.println("This is inside constructor of abstract class");
		name="Redmi Note 10";
	}
	
}
class brandmobile extends mobile{
	brandmobile(){ // Constructor of Child class
		super(); // Super keyword refers to parent class
	}
}
//Note that the super should always be the first statement of the subclass constructor
public class G_AM_AC {

	public static void main(String[] args) {
		brandmobile obj=new brandmobile();
		System.out.println(obj.name);

	}

}
