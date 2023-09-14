//WAP to reverse a sentence while preserving spaces
public class Q3 {
  public static void main(String[] args) {
    String input = "Think Twice";
    String arr[] = input.split(" ");
    String output="";
    for (String s : arr) {
      for (int i = s.length()-1; i>=0; i--) {
        output = output + s.charAt(i);
      }
      output += " ";
    }

    System.out.println(output);
  }  
}