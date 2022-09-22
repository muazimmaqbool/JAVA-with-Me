//Methods of Java String
public class K_Methods_of_Java_String {
	public static void main(String[] args) {
		//contains() (checks whether the string contains a substring)
		String str1="Java Python C++";
		boolean result=str1.contains("Java"); //check if str1 contains "Java"
		System.out.println(result); // o/p = true
		//or
		//boolean result=str1.contains("+"); //check if str1 contains "+"
		//System.out.println(result); // o/p = true
		
		//substring()  (returns the substring of the string)
		//syntax = string.substring(int startIndex, int endIndex) // let you want to print upto 5 then endindex= 6
		String str2="My Enroll is 6655";
		// extract substring from index 0 to 5
		System.out.println(str2.substring(0,6)); // o/p = My Enr
		
		//join()  (join the given strings using the delimiter)
		//delimiter - the delimiter to be joined with the elements
		//elements - elements to be joined
		String str3="My";
		String str4="Name is";
		String str5="Muazim Maqbool";
		String str=String.join(" ",str3,str4,str5); // join strings with space between them
		System.out.println(str);
		
		//replace()  (replaces the specified old character with the specified new character)
		// syntax = string.replace(char oldChar, char newChar)
		String str6="Python and Java";
		System.out.println("Str6: "+str6);
		// replace P with c
		System.out.println("Replacing 'P' with 'c' ");
		System.out.println("Str6: "+str6.replace('P', 'c'));
		// replace P with c
		System.out.println("Replacing \"and\" with \"&\" ");
		System.out.println("Str6: "+str6.replace("and", "&"));
		
		//replaceAll() (replaces all substrings matching the regex pattern)
	}

}
