//Public Access Modifier
//When methods, variables, classes, and so on are declared public, 
//then we can access them from anywhere. The public access modifier has no scope restriction.

//When no access modifier is used, then by default the member of a class is public within its own package, 
//but cannot be accessed outside of its package. protected applies only when inheritance is involved.

class animal{ // default its public so no need to mention public
	public int legcount;
	public int legcount1; // will access this in next program
	public void display() {
		System.out.println("Test public access modifier example");
		System.out.println("Cows have: "+legcount+" Legs.");
		System.out.println("Hen have: "+legcount1+" Legs.");
	}
}
public class P_Public_AM {
	public static void main(String[]args) {
		//accessing the public class
		animal obj=new animal();
		obj.legcount=4;
		obj.legcount1=2;
		obj.display();
		//now will try to access this from Pp_test program
		
	}

}
