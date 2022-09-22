//Java final Method
//In Java, the final method cannot be overridden by the child class.
class finaltest{
	public final void display() {
		System.out.println("This line is inside final method");
	}
}
class U_finalMethod extends finaltest {
	/*
	//tried to override final method
	public final void display() { // will show error
	    System.out.println("The final method is overridden.");
	}*/

	public static void main(String[] args) {
		U_finalMethod obj=new U_finalMethod();
		obj.display();

	}

}
