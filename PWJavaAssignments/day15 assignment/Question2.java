
// Q. How do you concatenate two strings in java? Give an example?
/*
 * we can concatenate two strings in java using concate() method and + operator
 * */
public class Question2 {
	public static void main(String a[]) {
		
		String s1 = "Kit";
		String s2 = "Kat";
		
		String name = s1.concat(s2);
		String name1 = s1+s2;
		System.out.println(name);
		System.out.println(name1);
	}
}