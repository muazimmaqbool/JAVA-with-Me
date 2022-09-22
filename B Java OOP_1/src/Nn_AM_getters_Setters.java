 //Getters and Setters
// if we need to access those private variables. In this case, we can use the getters and setters method. 
class data1{
	private String name;
	//getter method
	public String getname() {
		return this.name;
	}
	//setter method
	public void setname(String name) {
		this.name=name;
	}
}
public class Nn_AM_getters_Setters {
      
	public static void main(String[] args) {
		data1 obj=new data1();
		// access the private variable using the getter and setter
		obj.setname("Java");
		System.out.println(obj.getname());
		/*we have a private variable named name. In order to access the variable from the outer class,
       we have used methods: getName() and setName(). These methods are called getter and setter in Java.
		Here, we have used the setter method (setName()) to assign value to the variable and
		 the getter method (getName()) to access the variable.
		We have used this keyword inside the setName() to refer to the variable of the class. 
		To learn more on this keyword
		Note: We cannot declare classes and interfaces private in Java. However, 
		the nested classes can be declared private*/
	}

}
