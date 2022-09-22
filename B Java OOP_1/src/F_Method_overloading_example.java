//Let’s look at a real-world example:
class F_Method_overloading_example {
	private String enternumber(int value) {
		return String.format("%d",value);
	}
	private String enternumber(float value) {
		return String.format("%f",value);
	}
	private String enternumber(double value) {
		return String.format("%.3f",value);
	}
	private String enternumber(String value) {
		return String.format("%.1f",Double.parseDouble(value));
	}

	public static void main(String[] args) {
		F_Method_overloading_example obj=new F_Method_overloading_example();
		System.out.println(obj.enternumber(6655));
		System.out.println(obj.enternumber(95.86));
		System.out.println(obj.enternumber(95.66556));
		System.out.println(obj.enternumber("6655"));
	}
	//Note: In Java, you can also overload constructors in a similar way like methods.
	/*Important Points
	Two or more methods can have the same name inside the same class if they accept different arguments. 
	This feature is known as method overloading.
	Method overloading is achieved by either:
	changing the number of arguments.
	or changing the data type of arguments.
	It is not method overloading if we only change the return type of methods. 
	There must be differences in the number of parameters.
*/
}
