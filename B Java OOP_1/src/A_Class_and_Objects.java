// Java Class and Objects
public class A_Class_and_Objects {
	public static void main(String[] args) {
		/*
		Java is an object-oriented programming language. 
		The core concept of the object-oriented approach is to break complex problems into smaller objects.
		An object is any entity that has a state and behavior. For example, a bicycle is an object. It has
		States: pidle, first gear, etc
		Behaviors: braking, accelerating, etc.
		
		//Java Class
		 * A class is a blueprint for the object. Before we create an object, we first need to define the class.
		 We can think of the class as a sketch (prototype) of a house.
		 It contains all the details about the floors, doors, windows, etc.
		 Based on these descriptions we build the house. House is the object.
		Since many houses can be made from the same description, we can create many objects from a class.
		
		//Create a class in Java
		 * class ClassName {
               // fields
              // methods  }
          Here, fields (variables) and methods represent the state and behavior of the object respectively.
				fields are used to store data
				methods are used to perform some operations
				For our bicycle object, we can create the class as: */
		/*
		class bicycles{
			//state or field
			private int gear=5;
			//behavior or method
			public void breaking() {
				System.out.println("Working of Breaking");
			}
		}
		*/
		/*In the above example, 
		we have created a class named Bicycle. It contains a field named gear and a method named braking()
		Here, Bicycle is a prototype. Now, we can create any number of bicycles using the prototype. 
		And, all the bicycles will share the fields and methods of the prototype.*/
		//We have used keywords private and public. These are known as access modifiers
		
		//Java Objects
		//An object is called an instance of a class.
		//For example, suppose Bicycle is a class then MountainBicycle, SportsBicycle, TouringBicycle,
		//etc can be considered as objects of the class.

		//Creating an Object in Java
		//syntax :-> className object = new className();
		// for bicycles class
		
		/*bicycles sportsBicycle=new bicycles();  //creating object sportsBicycle
		bicycles mountainBicycle= new bicycles();  */
		
		/*We have used the new keyword along with the constructor of the class to create an object. 
		Constructors are similar to methods and have the same name as the class.
		For example, Bicycle() is the constructor of the Bicycle class.
		
		Here, sportsBicycle and touringBicycle are the names of objects. 
		We can use them to access fields and methods of the class.
		As you can see, we have created two objects of the class.
		We can create multiple objects of a single class in Java.
		Note: Fields and methods of a class are also called members of the class.*/
		
		//Access Members of a Class
		//We can use the name of objects along with the . operator to access members of a class. For example,
		//sportsBicycle.gear;
		//sportsBicycle.breaking();
		//this examples works like this
		class Bicycles{
			private int gear;
			public void breaking() {
				System.out.println("Working on Breaking !");
			}
			public void showGear() {
				System.out.println("Showing the Number of gears in the Bicycle :"+gear);
			}
		}
		//creating object
		Bicycles sportsBicycle=new Bicycles();
		//accessing fields and methods
		sportsBicycle.gear=5;     //access the field gear
		sportsBicycle.breaking(); //access the method braking()
	    sportsBicycle.showGear(); //access the method showGear()
		
	}

}
//what is constructor ?
/*A constructor is a special method of a class or structure in object-oriented programming
 *  that initializes a newly created object of that type.
 *  Whenever an object is created, the constructor is called automatically*
 */