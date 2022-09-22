//Java this Keyword
//In Java, this keyword is used to refer to the current object inside a method or a constructor.
public class Q_this_Keyword {
	int var;
	Q_this_Keyword(int var){
		this.var=var;
		System.out.println("This reference: "+this);
	}
	public static void main(String[] args) {
		Q_this_Keyword obj=new Q_this_Keyword(10);
		System.out.println("Obj reference: "+obj);
		// o/p = This reference: Q_this_Keyword@4517d9a3
		//       Obj reference: Q_this_Keyword@4517d9a3
		//Here, we can see that the reference of both obj and this is the same. 
		//It means this is nothing but the reference to the current object.
      	

	}

}
