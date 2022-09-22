//Java final Class
//In Java, the final class cannot be inherited by another class. 
final class demo{
	public void display() {
		System.out.println("This is inside method in final class");
	}
}
//try to extend the final class
public class Uu_final_Class extends demo { //if we use this it will show error
//public class Uu_final_Class{    // to run it properly use this line
	public void display() {
		System.out.println("This overrides method display inside final class as this method is not final but its class is not extended");
	}
	public static void main(String[] args) {
		Uu_final_Class obj=new Uu_final_Class();
		obj.display();
	}

}
