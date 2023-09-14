// WAP to remove duplicates from a string
public class Q1 {
    public static void main(String[] args) {
        String s = "programming";
        System.out.println("Before "+ s);
        String outpuString = "";
        for(int i=0 ; i<s.length() ;i++){
            char ch = s.charAt(i);
            int j = s.indexOf(ch,i+1);
            if (j==-1) {
                outpuString = outpuString+ch;
            }
        }

        System.out.println("After "+outpuString);
    }
}
