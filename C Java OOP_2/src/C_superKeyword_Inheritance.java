//super Keyword in Java Inheritance
/*Previously we saw that the same method in the subclass overrides the method in superclass.
In such a situation,
the super keyword is used to call the method of the parent class from the method of the child class.*/

//Example 3: super Keyword in Inheritance
class animal{
	animal(){
		System.out.println("Inside constructor of superclass");
	}
	//Access Attributes of the Superclass
	//The superclass and subclass can have attributes with the same name.
	//We use the super keyword to access the attribute of the superclass.
    protected String name="Java";
	public void eat(){
		System.out.println("Cow eat green grass in summer ");
	}
	
	
}
class cow extends animal{
	/* here constructor of sub class automatically calls the constructor of super class
	cow(){
		//animal obj1=new animal(); // optional
		System.out.println("Inside constructor of sub-class");
	}*/
	public String name="Python";
	@Override
	public void eat() {
		super.eat(); //calls eat method of superclass
		System.out.println("Cow gives milk");
	}
	public void legs() {
		System.out.println("Cow has 4 legs");
	}
	public void type() {
		System.out.println(name); // will show o/p as python as it access name attribute of cow class
		System.out.println(super.name); // will show o/p as java as it access name attribute of animal class
	}
	
}
public class C_superKeyword_Inheritance {

	public static void main(String[] args) {
		cow obj=new cow();
		obj.eat(); 
		obj.legs();
        obj.type();
	}
	/*super.eat();
	Here, the super keyword is used to call the eat() method present in the superclass.
	We can also use the super keyword to call the constructor of the superclass 
	from the constructor of the subclass. */

}
