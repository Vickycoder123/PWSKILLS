// WAP to check if 2552 is pallindrome or not.
public class Q3 {
    public static void main(String[] args) {
        String inpuString = "2552";
        String revString = "";
        for(int i=inpuString.length()-1 ; i>=0 ;i--){
            revString = revString + inpuString.charAt(i);
        }

        System.out.println(inpuString.equals(revString));
    }
}
