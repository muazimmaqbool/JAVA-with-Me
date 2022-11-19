//Accessing Members of Outer Class
/*In Java, static nested classes are associated with the outer class.
This is why static nested classes can only access the class members (static fields and methods) of the outer class.
Let’s see what will happen if we try to access non-static fields and methods of the outer class.*/

//Example: Accessing Non-static members
//As mentioned above, only nested classes can be static. We cannot have static top-level classes.
//static class phone{ // will show error
class phone{
	static class brand{
		public void check() {
			System.out.println("The brand of phone is: Apple  'inside static class'");
		}
	}
	class connectivity{
		public void check() {
			System.out.println("It's 5G mobile phone  'inside non-static class'");
		}
	}
public void charger(){
		System.out.println("Charger Type: C-Type   'inside method of outer class '");
	}
}
public class E_StaticClass {

	public static void main(String[] args) {
		phone ph=new phone();
		ph.charger();
		
		phone.brand brnd=new phone.brand(); 
		brnd.check();
		//brnd.charger(); // trying to access method of ouoter class using object static class's object
		                //   it will show error
//It is because brnd is an object of a static class and we cannot access non-static methods from static classes.
		
		phone.connectivity cont=ph.new connectivity();
		cont.check();
		

	}

}
