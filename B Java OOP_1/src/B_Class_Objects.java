//Example: Java Class and Objects 

class Lamp{
	// true if light is on
	  // false if light is off
	boolean ison;
	// method to turn on the light
	void turnon() {
		ison=true;
		System.out.println("Light on ? :"+ison);
		}
	// method to turnoff the light
	void turnoff() {
		ison=false;
		System.out.println("Light on ? :"+ison);
	}
}
public class B_Class_Objects {
	public static void main(String[]args) {
		//creating two objects lamp1 and lamp2
		Lamp lamp1=new Lamp();
		Lamp lamp2=new Lamp();
		//Lamp lamp2=new Lamp();
		// turn on the light by
	    // calling method turnon()
		lamp1.turnon();
		// turn off the light by
	    // calling method turnoff()
		lamp2.turnoff();
		//lamp1.turnoff();
	}
	
	}

//Create objects inside the same class , v.v.v important

/*
class B_Class_Objects { 
  // stores the value for light
  // true if light is on
  boolean isOn;
  // method to turn on the light
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);

  }
 public static void main(String[] args) {
    
    // create an object of Lamp
	 B_Class_Objects led = new B_Class_Objects();

    // access method using object
    led.turnOn();
  }
}     //Here, we are creating the object inside the main() method of the same class . 
*/

