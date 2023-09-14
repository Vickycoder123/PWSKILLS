
//Q. How do you compare strings in java? Give an example?

/*There are two different ways to compare strings in java 
 * if we use == operator then string reference checking is possible
 * but if we want to check the content of the given strings then 
 * equals() method is used. 
*/
public class Question4 {
	public static void main(String a[]) {
		String s1 = "shubham";
		String s2 = "shubham";
		System.out.println(s1.equals(s2));
	}
}
