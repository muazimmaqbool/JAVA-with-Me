//Java Constructors Overloading
class I_Constructors_Overloading {
	String lang;
	// constructor with no parameter
	I_Constructors_Overloading(){
		this.lang="Java";
	}
	 // constructor with a single parameter
	I_Constructors_Overloading(String l){
		this.lang=l;
	}
	public void getlang() {
		System.out.println("Language: "+this.lang);
	}
	public static void main(String[]args) {
		I_Constructors_Overloading obj1=new I_Constructors_Overloading(); // object of constructor without parameters
		I_Constructors_Overloading obj2=new I_Constructors_Overloading("Python");//object of constructor with parameters
		obj1.getlang();
		obj2.getlang();
	}
	//We have used this keyword to specify the variable of the class.
	/*What is the keyword this in Java?
	The this keyword refers to the current object in a method or constructor. 
	The most common use of the this keyword is to eliminate
    the confusion between class attributes and parameters with the same name 
    (because a class attribute is shadowed by a method or constructor parameter).*/

}
