//What is mutable string in java give an example.

/* Mutable Strings in java are those strings whose content can be changed
 * without creating new object.
 * StringBuffer and StringBuilder are two different versions of mutable 
 * string in java.
 */
public class Q1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("shubham");
        System.out.println("Before change ="+sb);
        sb.append("mane");
        System.out.println("After change ="+sb);
    }
}