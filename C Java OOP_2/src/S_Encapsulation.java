//Data Hiding
//Data hiding is a way of restricting the access of our data members by hiding the implementation details. 
//Encapsulation also provides a way for data hiding.
//Example 2: Data hiding using the private specifier
class person{
	// private field
	  private int age;
	
	//getter method
	  public int getage() {
		  return age;
	  }
	  //setter method
	  public void setage(int age) {
		  this.age=age;
	  }
}
public class S_Encapsulation {

	public static void main(String[] args) {
		person p1=new person();
		p1.setage(22);
		System.out.println("value of age is: "+p1.getage());
		// error: age has private access in Person
		//p1.age = 24;
	}

}
