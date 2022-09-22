//Using this in Constructor Overloading
/*While working with constructor overloading, we might have to invoke one constructor from another constructor. 
In such a case, we cannot call the constructor explicitly. Instead, we have to use this keyword.
Here, we use a different form of this keyword. That is, this()
One of the huge advantages of this() is to reduce the amount of duplicate code. 
However, we should be always careful while using this().*/
class S_This3 {
	private int a,b;
	// constructor with 2 parameters
	private S_This3(int i,int j) {
		this.a=i;
		this.b=j;
		
	}
	// constructor with single parameters
	private S_This3(int m) {
		this(m,m); // invokes the constructor with 2 parameters(i=m and j=m)
	}
	// constructor with no parameter
	private S_This3() {
		this(0); //invokes the constructor with single parameter
	}
	//@Override means that the method is overriding the parent class 
	@Override
	public String toString() {
		return this.a+" + " + this.b;
	}
	public static void main(String[]args) {
		//creating object of Complex class
        // calls the constructor with 2 parameters
		S_This3 obj1=new S_This3(6,7);
		// calls the constructor with single parameters
		S_This3 obj2=new S_This3(2);
		// calls the constructor with no parameters
		S_This3 obj3=new S_This3();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//In the above example, we have used this keyword,
		//to call the constructor Complex(int i, int j) from the constructor Complex(int i)
		//to call the constructor Complex(int i) from the constructor Complex()
		//Note: Invoking one constructor from another constructor is called explicit constructor invocation.
	}
	

}
