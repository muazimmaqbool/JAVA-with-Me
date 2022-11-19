//Example 2: Java Enum with the switch statement
enum sizeOFpizza{
	SMALL, MEDIUM, LARGE, EXTRALARGE
}
class test{
	//Also, we can create variables of enum types. For example, sizeOFpizza pizzaSize;
	sizeOFpizza pizzasize; //declared a variable pizzasize of the sizeOFpizza type.
	
	/*Here, pizzasize is a variable of the sizeOFpizza type. It can only be assigned with 4 values.
	pizzasize = sizeOFpizza.SMALL;
	pizzasize = sizeOFpizza.MEDIUM;
	pizzasize = sizeOFpizza.LARGE;
	pizzasize = sizeOFpizza.EXTRALARGE;*/
	
	public test(sizeOFpizza pizzasizeorder) {
		this.pizzasize=pizzasizeorder;
	}
	public void orderpizza() {
		switch(pizzasize) {
		case SMALL:
			System.out.println("I ordered a Small size pizza.");
		       break;
		case MEDIUM:
			System.out.println("I ordered a Medium size pizza.");
		       break;
		case LARGE:
			System.out.println("I ordered a Large size pizza.");
		       break;
		case EXTRALARGE:
			System.out.println("I ordered a ExtraLarge size pizza.");
		       break;
		}
	}
}
public class L_Enum {

	public static void main(String[] args) {
		test t1=new test(sizeOFpizza.MEDIUM);
		t1.orderpizza();
		/*It will call the test() constructor inside the test class.
		Now, the variable sizepizza is assigned with the MEDIUM constant.*/
	}

}
