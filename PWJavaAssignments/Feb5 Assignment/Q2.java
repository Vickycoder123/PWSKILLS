// WAP to print duplicate characters from string.
public class Q2 {
    public static void main(String[] args) {
        String inputString = "kitkat";
        String outpuString = "";
        for(int i=0;i<inputString.length() ; i++){
            char ch = inputString.charAt(i);
            int j = inputString.indexOf(ch,i+1);
            if (j!=-1) {
                outpuString = outpuString + ch;
            }
        }

        System.out.println("Before "+inputString);
        System.out.println("After "+outpuString);
    }
}
