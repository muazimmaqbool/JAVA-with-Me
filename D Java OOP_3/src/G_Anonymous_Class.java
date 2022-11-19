//Example 1: Anonymous Class Extending a Class
class item{
	public void display() {
		System.out.println("Inside the item class which is extended by Anonymousdemo class Anonymousdemo");
	}
}
class Anonymousdemo{
	public void createclass() {
		// creation of anonymous class extending class item
		item obj=new item() { //We then created an anonymous class that extends the class item and
			//overrides the display() method.
			public void display() {
				System.out.println("Inside an anonymous class(demo)");
			}
		};
		obj.display();
		}
}
public class G_Anonymous_Class {
	public static void main(String[]args) {
		Anonymousdemo an=new Anonymousdemo();
		an.createclass(); // it will call display method of Anonymousdemo class and obj.display(); will not be called
	}
	//When we run the program, an object obj of the anonymous class is created. 
	//The object then calls the display() method of the anonymous class.

}
