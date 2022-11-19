//Methods of Java Enum Class
//There are some predefined methods in enum classes that are readily available for use.
/*
1. Java Enum ordinal()
The ordinal() method returns the position of an enum constant. For example,
ordinal(SMALL) 
// returns 0

2. Enum compareTo()
The compareTo() method compares the enum constants based on their ordinal value. For example,
Size.SMALL.compareTo(Size.MEDIUM)
 // returns ordinal(SMALL) - ordinal(MEDIUM)

3. Enum toString()
The toString() method returns the string representation of the enum constants. For example,
SMALL.toString()
// returns "SMALL"

4. Enum name()
The name() method returns the defined name of an enum constant in string form. 
The returned value from the name() method is final. For example,
name(SMALL)
// returns "SMALL"

5. Java Enum valueOf()
The valueOf() method takes a string and returns an enum constant having the same string name. For example,
Size.valueOf("SMALL")
// returns constant SMALL.

6. Enum values()
The values() method returns an array of enum type containing all the enum constants. For example,
Size[] enumArray = Size.value();*/
enum fruits{
	APPLE,ORANGE,BANANA,GRAPES,WATERMELLON,MANGO;
}
public class N_Enum {

	public static void main(String[] args) {
		fruits obj=fruits.APPLE;
		System.out.println(obj.ordinal()); // o/p = 0
		System.out.println(obj.name()); // o/p = APPLE
      System.out.println(fruits.APPLE.compareTo(fruits.GRAPES)); // o/p = return ordinal(APPLE)-ordinal(GRAPES) 
                                                                 //  i.e =   0-3 = -3
      System.out.println(fruits.MANGO.compareTo(fruits.ORANGE)); // o/p = return ordinal(MANGO)-ordinal(ORANGE) 
      														    //  i.e = 5-1 = 4
      System.out.println(fruits.BANANA.toString()); 
      System.out.println(obj.name());
      System.out.println(fruits.valueOf("WATERMELLON"));
      //System.out.println(fruits[] enumarray=fruits.value());
	}
}
	/*Why Java Enums?
			In Java, enum was introduced to replace the use of int constants.

			Suppose we have used a collection of int constants.

			class Size {
			   public final static int SMALL = 1;
			   public final static int MEDIUM = 2;
			   public final static int LARGE = 3;
			   public final static int EXTRALARGE = 4;
			}
			Here, the problem arises if we print the constants.
			It is because only the number is printed which might not be helpful.

			So, instead of using int constants, we can simply use enums. For example,

			enum Size {
			   SMALL, MEDIUM, LARGE, EXTRALARGE
			}
			This makes our code more intuitive.

			Also, enum provides compile-time type safety.

			If we declare a variable of the Size type. For example,

			Size size;
			Here, it is guaranteed that the variable will hold one of the four values. 
			Now, If we try to pass values other than those four values, the compiler will generate an error.*/
