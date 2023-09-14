
public class Question7 {
// Q. Write a program to delete all the consonants from the string
// "Hello, have a good day".
	public static void main(String[] args) {
		String s = "Hello, have a good day";
		s=s.toLowerCase();
		String outputString = "";
		for(int i=0 ; i<s.length() ; i++){
			char c = s.charAt(i);
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				continue;
			}
			outputString = outputString+c;
		}
		System.out.println(outputString);
	}

}
