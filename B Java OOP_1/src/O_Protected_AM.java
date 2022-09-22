//Protected Access Modifier
//When methods and data members are declared protected, 
//we can access them within the same package as well as from subclasses
class Test{
	protected void display() {
		System.out.println("This is inside protected method");
	}
}
class O_Protected_AM extends Test{
      //The Test class is inherited by the O_Protected_AM class
	public static void main(String[] args) {
		//creating an object of class O_Protected_AM
		O_Protected_AM obj=new O_Protected_AM();
		//accessing the protected method display
		obj.display();
		//Since protected methods can be accessed from the child classes,
		//we are able to access the method of Test class from the O_Protected_AM class.
	
        //Note: We cannot declare classes or interfaces protected in Java.
	}

}
