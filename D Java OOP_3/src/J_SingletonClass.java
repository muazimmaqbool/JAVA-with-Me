//Use of Singleton in Java
//Singletons can be used while working with databases. They can be used to create a connection pool
//to access the database while reusing the same connection for all the clients. For example,
class Database{ //We have created a singleton class Database.
	private static Database dbobject;
	//The dbObject is a class type field. This will refer to the object of the class Database
	private Database() {
		//The private constructor Database() prevents object creation outside of the class
	}
	
	//The static class type method getInstance() returns the instance of the class to the outside world.
	public static Database getInstance() {
		// create object if it's not already created
		if(dbobject==null) {
			dbobject=new Database();
		}
		// returns the singleton object
		return dbobject;
	}
	public void getConnection() {
		System.out.println("You are now connected to the database");
	}
}
public class J_SingletonClass {

	public static void main(String[] args) {
		Database db1;
		//// refers to the only object of Database
		db1=Database.getInstance();
		db1.getConnection();
		/*In the Main class, 
		we have class type variable db1. We are calling getInstance() 
		using db1 to get the only object of the Database.*/
		//The method getConnection() can only be accessed using the object of the Database.
		
		//trying to create another object
		Database db2;
		db2=Database.getInstance(); // it will work //but it didn't create new object it's using the same dbobject
		db2.getConnection();
		
/*Singleton is a design pattern rather than a feature specific to Java. 
 * A design pattern is like our code library that includes various coding techniques shared by programmers 
 * around the world.
 */
//It's important to note that, there are only a few scenarios (like logging) where singletons make sense. 
//We recommend you avoid using singletons completely if you are not sure whether to use them or not.
	
	}

}
