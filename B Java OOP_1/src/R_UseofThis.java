//Use of this Keyword
//Using this for Ambiguity Variable Names
/*In Java, it is not allowed to declare two or more variables having the same name inside a scope (class scope or method scope).
However, instance variables and parameters may have the same name, example:
class MyClass {
    // instance variable
    int age;

    // parameter
    MyClass(int age){
        age = age;
    }
}*/
//In the above program, the instance variable and the parameter have the same name: age. 
//Here, the Java compiler is confused due to name ambiguity.
//In such a situation, we use this keyword
public class R_UseofThis {
    int age;
    R_UseofThis(int age){
    	//without using this keyword: here o/p will be obj.age= 0
    	//age=age;
    	
    	// using this keyword.
    	this.age=age;
    }
	public static void main(String[] args) {
		R_UseofThis obj=new R_UseofThis(6655);
		System.out.println("obj.age= "+obj.age);
		//without using this keyword: here o/p will be obj.age= 0
		//This is because the Java compiler gets confused because of the ambiguity in names 
		//between instance the variable and the parameter.
		
		// using this keyword
		//Now, we are getting the expected output. It is because when the constructor is called, 
		//this inside the constructor is replaced by the object obj that has called the constructor. 
		//Hence the age variable is assigned value 8.
		
		/*Also, if the name of the parameter and instance variable is different, the compiler automatically appends this keyword. For example, the code:

			class Main {
			    int age;

			    Main(int i) {
			        age = i;
			    }
			}
			is equivalent to:

			class Main {
			    int age;

			    Main(int i) {
			        this.age = i;
			    }
			}*/

	}

}
