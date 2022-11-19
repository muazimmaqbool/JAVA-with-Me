//Accessing Members of Outer Class within Inner Class
//We can access the members of the outer class by using this keyword.

//Example 2: Accessing Members
class car{
	String CarName;
	String CarType;
	 // assign values using constructor
	public car(String name, String type) {
		this.CarName=name;
		this.CarType=type;
	}
	// private method
	private String getcarName() {
		return this.CarName;
	}
//inner class
	class engine{
		String enginetype;
		void setengine() {
			// Accessing the carType property of Car
			if(car.this.CarType.contentEquals("sports")) { 
				//using this keyword to access the carType variable of the outer class. 
				 //You may have noticed that instead of using this.carType we have used Car.this.carType
				if(car.this.getcarName().equals("BMW")) { // Invoking method getCarName() of Car
					this.enginetype="Smaller";
				}else {
					this.enginetype="larger";
				}
			}
			else {
				this.enginetype="Medium";
			}
		}
		String getenginetype() {
			return this.enginetype;
		}
			
	}
}
public class B_NestClass_InnerClass {

	public static void main(String[] args) {
		//create an object of the outer class Car
		car car1=new car("BMW","sports");
		// create an object of inner class using the outer class
		car.engine eng=car1.new engine(); 
		eng.setengine();
		System.out.println("Engine Type of BMW(sports): "+eng.getenginetype()); // o/p: Smaller
		
		car car2=new car("Audi","OffRoad");
		car.engine eng2=car2.new engine();
		eng2.setengine();
		System.out.println("Engine Type of Audi(OffRoad): "+eng2.getenginetype()); // o/p: Medium
		
		car car3=new car("Audi","sports");
		car.engine eng3=car3.new engine();
		eng3.setengine();
		System.out.println("Engine Type of Audi(sports): "+eng3.getenginetype()); // o/p: larger
		
		car car4=new car("BMW","OffRoad");
		car.engine eng4=car4.new engine();
		eng4.setengine();
		System.out.println("Engine Type of BMW(OffRoad): "+eng4.getenginetype()); // o/p: Medium


	}

}
