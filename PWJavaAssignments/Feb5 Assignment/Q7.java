//WAP to check if string contains all unique characters
public class Q7 {
    public static void main(String[] args) {
        String s = "computer";
        boolean unique = true;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j)) {
                    unique=false;
                    break;
                }
            }
        }

        if (unique) {
            System.out.println("Uniuqe String");
        } else {
            System.out.println("Not unique");
        }
    }
}
