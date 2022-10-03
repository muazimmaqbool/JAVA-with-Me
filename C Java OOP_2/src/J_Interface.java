//Java Interface
//Example 2: Java Interface
interface laptop1{
	void getName(String name);
}
class item implements laptop1{
	public void getName(String n) {
		System.out.println("The Item name is: "+n);
	}
}
public class J_Interface {

	public static void main(String[] args) {
		item obj=new item();
		obj.getName("HP Laptop");
		//we have created an interface named Language. The interface includes an abstract method getName().
	}

}
